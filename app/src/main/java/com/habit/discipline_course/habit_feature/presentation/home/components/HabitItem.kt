package com.habit.discipline_course.habit_feature.presentation.home.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.habit.discipline_course.R

@Composable
fun HabitItem(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    onHabitClick: () -> Unit,
    onReset: () -> Unit
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ){
        Card(
            modifier = Modifier.weight(0.8f),
            onClick = { onHabitClick() },
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.primary),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background)
        ){
            Column(
                modifier = Modifier.padding(10.dp),
                verticalArrangement = Arrangement.Top
            ){
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = title, color = MaterialTheme.colorScheme.secondary, fontSize = 18.sp)

                    Row(verticalAlignment = Alignment.CenterVertically){
                        Image(
                            painter = painterResource(R.drawable.flame_icon),
                            contentDescription = stringResource(R.string.flame_icon_description),
                            colorFilter = ColorFilter.tint(color = Color.Yellow)
                        )

                        Text(text = "5", color = MaterialTheme.colorScheme.secondary, fontSize = 20.sp)
                    }
                }

                Text(
                    text = description,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Light,
                    color = MaterialTheme.colorScheme.secondary,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2
                )
            }
        }

        Card(
            modifier = Modifier.weight(0.2f).size(50.dp).padding(start = 8.dp),
            onClick = { onReset() },
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary)
        ){
            Box(modifier = Modifier.fillMaxSize()){
                Icon(
                    modifier = Modifier.size(18.dp).align(Alignment.Center),
                    imageVector = Icons.Default.Check,
                    contentDescription = stringResource(R.string.complete_habit_icon),
                    tint = MaterialTheme.colorScheme.background
                )
            }
        }
    }
}