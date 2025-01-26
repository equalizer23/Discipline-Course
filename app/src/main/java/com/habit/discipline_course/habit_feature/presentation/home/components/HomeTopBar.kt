package com.habit.discipline_course.habit_feature.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.habit.discipline_course.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeTopBar(
    title: String,
    onStatsClick: () -> Unit,
    onSettingsClick: () -> Unit
) {
    TopAppBar(
        modifier = Modifier.padding(top = WindowInsets.systemBars.asPaddingValues().calculateTopPadding()),
        title = {
            Text(text = title, color = MaterialTheme.colorScheme.secondary, fontSize = 24.sp)
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.background),
        windowInsets = WindowInsets(top = 5.dp),
        actions = {
            IconButton(
                onClick = { onStatsClick() }
            ) {
                Image(
                    painter = painterResource(R.drawable.chart_icon),
                    contentDescription = stringResource(R.string.chart_icon_description),
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.secondary)
                )
            }

            IconButton(
                onClick = { onSettingsClick() }
            ) {
                Image(
                    imageVector = Icons.Default.Settings,
                    contentDescription = stringResource(R.string.settings_description),
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.secondary)
                )
            }
        }
    )
}