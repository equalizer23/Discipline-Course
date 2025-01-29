package com.habit.discipline_course.habit_feature.presentation.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.habit.discipline_course.habit_feature.presentation.home.components.HomeTopBar
import com.habit.discipline_course.R
import com.habit.discipline_course.habit_feature.presentation.home.components.HabitItem

@Composable
fun HomeScreen(
    onFabClick: () -> Unit,
    onHabitClick: (String) -> Unit,
    onSettingsClick: () -> Unit
) {
    Scaffold(
        topBar = {
            HomeTopBar(
                title = stringResource(R.string.welcome_back),
                onStatsClick = {},
                onSettingsClick = onSettingsClick
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { onFabClick() },
                shape = CircleShape,
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.background
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = stringResource(R.string.create_habit_button),
                    tint = MaterialTheme.colorScheme.background
                )
            }
        }
    ){ padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(vertical = 20.dp, horizontal = 10.dp)
                .padding(bottom = WindowInsets.systemBars.asPaddingValues().calculateBottomPadding())
        ){
            LazyColumn(
                modifier = Modifier.align(Alignment.Center)
            ){
                items(3){
                    HabitItem(
                        modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
                        title = "Create a presentation",
                        description = "I need to do it today",
                        onReset = {},
                        onHabitClick = { habitId -> onHabitClick(habitId) }
                    )
                }
            }
        }
    }
}