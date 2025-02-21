package com.habit.discipline_course.habit_feature.presentation.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.habit.discipline_course.R
import com.habit.discipline_course.core.presentation.DisciplineTopBar
import com.habit.discipline_course.habit_feature.presentation.settings.components.SettingItem

@Composable
fun SettingsScreen(
    onBackClick: () -> Unit,
    toNotificationSettings: () -> Unit
) {
    Scaffold(
        topBar = { DisciplineTopBar(
            title = stringResource(R.string.settings_topbar_title),
            onBackClick = onBackClick
        )
        }
    ){ padding ->
        Column(modifier = Modifier.fillMaxSize().padding(padding)){
            SettingItem(onClick = toNotificationSettings)
        }
    }
}