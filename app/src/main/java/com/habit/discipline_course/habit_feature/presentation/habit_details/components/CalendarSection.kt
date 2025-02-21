package com.habit.discipline_course.habit_feature.presentation.habit_details.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.boguszpawlowski.composecalendar.StaticCalendar
import java.time.format.TextStyle
import java.util.Locale

@Composable
fun CalendarStats() {
    StaticCalendar(
        monthHeader = {monthState ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                IconButton(
                    enabled = monthState.currentMonth > monthState.minMonth,
                    onClick = { monthState.currentMonth = monthState.currentMonth.minusMonths(1) }
                ) {
                    Image(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.secondary),
                        contentDescription = "Previous",
                    )
                }
                Text(
                    text = monthState.currentMonth.month
                        .getDisplayName(TextStyle.FULL, Locale.ENGLISH)
                        .lowercase()
                        .replaceFirstChar { it.titlecase() },
                    fontSize = 26.sp,
                    color = MaterialTheme.colorScheme.secondary
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = monthState.currentMonth.year.toString(),
                    color = MaterialTheme.colorScheme.secondary,
                    fontSize = 26.sp
                )

                IconButton(
                    enabled = monthState.currentMonth < monthState.maxMonth,
                    onClick = { monthState.currentMonth = monthState.currentMonth.plusMonths(1) }
                ) {
                    Image(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.secondary),
                        contentDescription = "Next",
                    )
                }
            }
        },
        daysOfWeekHeader = { days ->
            Row{
                days.forEach { day ->
                    Text(
                        text = day.getDisplayName(TextStyle.SHORT, Locale.ENGLISH),
                        color = MaterialTheme.colorScheme.secondary,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .weight(1f)
                            .wrapContentHeight()
                    )
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
        },
        dayContent = { state ->
            Card(
                modifier = Modifier
                    .aspectRatio(1f)
                    .background(MaterialTheme.colorScheme.background)
                    .padding(2.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = if (state.isFromCurrentMonth) 4.dp else 0.dp),
                border = if (state.isCurrentDay) BorderStroke(1.dp, MaterialTheme.colorScheme.primary) else null,
            ) {
                Column(
                    modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = state.date.dayOfMonth.toString(),
                        color = MaterialTheme.colorScheme.secondary,
                        fontSize = 14.sp
                    )

//                    Card(
//                        modifier = Modifier.size(8.dp),
//                        colors = CardDefaults.cardColors(
//                            containerColor = MaterialTheme.colorScheme.primary
//                        ),
//                        shape = CircleShape,
//                        content = {}
//                    )
                }
            }
        }
    )
}