package com.habit.discipline_course.habit_feature.presentation.habit_details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.habit.discipline_course.core.presentation.DisciplineTopBar
import com.habit.discipline_course.R
import com.habit.discipline_course.core.presentation.HabitTextField
import com.habit.discipline_course.habit_feature.presentation.habit_details.components.StreakSection

@Composable
fun HabitDetailsScreen(
    onBackClick: () -> Unit
) {
    Scaffold(
        topBar = { DisciplineTopBar(
            title = stringResource(R.string.habit_details_title),
            onBackClick = onBackClick)
        }
    ){ padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = padding.calculateTopPadding(), bottom = 10.dp)
        ){
            LazyColumn(
                modifier = Modifier.fillMaxSize().padding(horizontal = 10.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                item {
                    HabitTextField(
                        modifier = Modifier.fillMaxWidth(),
                        text = "",
                        onTextChange = {  },
                        label = stringResource(R.string.habit_title_text_field_label)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    HabitTextField(
                        modifier = Modifier.fillMaxWidth(),
                        text = "",
                        onTextChange = {  },
                        label = stringResource(R.string.habit_description_text_field_label)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp).height(50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.update_habit_button_text),
                            color = MaterialTheme.colorScheme.background
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = stringResource(R.string.habit_details_statistics_text),
                        color = MaterialTheme.colorScheme.secondary,
                        fontSize = 32.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    Column(
                        modifier = Modifier.padding(horizontal = 8.dp),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.Start
                    ){
                        StreakSection()

                        Spacer(modifier = Modifier.height(40.dp))

                        Button(
                            modifier = Modifier.height(50.dp).fillMaxWidth().padding(horizontal = 10.dp),
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            Text(
                                text = stringResource(R.string.delete_habit_text),
                                color = MaterialTheme.colorScheme.secondary
                            )
                        }
                    }
                }
            }
        }
    }
}