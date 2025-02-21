package com.habit.discipline_course.habit_feature.presentation.settings.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SettingItem(onClick: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxWidth().height(70.dp).clickable(onClick = onClick)
    ){
        Column(
            modifier = Modifier.fillMaxHeight().align(Alignment.CenterStart).padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ){
            Text(
                text = "Notifications",
                color = MaterialTheme.colorScheme.secondary,
                fontSize = 16.sp
            )

            Text(
                text = "To specify notifications you need to allow notification permission",
                color = MaterialTheme.colorScheme.secondary.copy(alpha = 0.7f),
                fontSize = 12.sp,
                fontWeight = FontWeight.Light
            )
        }

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth().align(Alignment.BottomCenter),
            color = MaterialTheme.colorScheme.secondary
        )
    }
}