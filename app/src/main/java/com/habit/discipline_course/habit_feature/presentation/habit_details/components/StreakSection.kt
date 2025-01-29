package com.habit.discipline_course.habit_feature.presentation.habit_details.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.habit.discipline_course.R

@Composable
fun StreakSection(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            text = stringResource(R.string.current_streak_text),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            color = MaterialTheme.colorScheme.secondary
        )

        Row(verticalAlignment = Alignment.CenterVertically){
            Text(
                text = "5",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                color = MaterialTheme.colorScheme.secondary
            )

            Image(
                modifier = Modifier.size(32.dp),
                painter = painterResource(R.drawable.flame_icon),
                contentDescription = stringResource(R.string.flame_icon_description),
                colorFilter = ColorFilter.tint(Color.Yellow)
            )
        }

    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            text = stringResource(R.string.longest_streak_text),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            color = MaterialTheme.colorScheme.secondary
        )

        Row(verticalAlignment = Alignment.CenterVertically){
            Text(
                text = "10",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                color = MaterialTheme.colorScheme.secondary
            )

            Image(
                modifier = Modifier.size(32.dp),
                painter = painterResource(R.drawable.flame_icon),
                contentDescription = stringResource(R.string.flame_icon_description),
                colorFilter = ColorFilter.tint(Color.Yellow)
            )
        }

    }
}