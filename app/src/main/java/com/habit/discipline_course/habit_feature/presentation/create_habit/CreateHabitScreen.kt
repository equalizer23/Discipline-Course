package com.habit.discipline_course.habit_feature.presentation.create_habit

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.habit.discipline_course.core.presentation.DisciplineTopBar
import com.habit.discipline_course.R
import com.habit.discipline_course.core.presentation.HabitTextField

@Composable
fun CreateHabitScreen(
    onBackClick: () -> Unit
) {
    Scaffold(
        topBar = {
            DisciplineTopBar(
                title = stringResource(R.string.create_habit_title),
                onBackClick = { onBackClick()}
            )
        }
    ){ padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = padding.calculateTopPadding(), bottom = 10.dp)
                .padding(horizontal = 10.dp),
            verticalArrangement = Arrangement.Center
        ){
            HabitTextField(
                modifier = Modifier.fillMaxWidth(),
                label = stringResource(R.string.habit_title_text_field_label),
                text = "",
                maxLength = 50,
                onTextChange = { title -> }
            )

            Spacer(modifier = Modifier.height(10.dp))

            HabitTextField(
                modifier = Modifier.fillMaxWidth(),
                label = stringResource(R.string.habit_description_text_field_label),
                text = "",
                maxLength = 150,
                onTextChange = { description -> }
            )

            Spacer(modifier = Modifier.height(60.dp))

            Button(
                onClick = { },
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth().height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            ) {
                Text(
                    text = stringResource(R.string.create_habit_button_text),
                    color = MaterialTheme.colorScheme.secondary,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}