package com.habit.discipline_course.habit_feature.presentation.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.habit.discipline_course.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StatsBottomDrawer(
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit
) {
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)

    ModalBottomSheet(
        modifier = modifier,
        onDismissRequest = onDismiss,
        sheetState = sheetState,
        containerColor = MaterialTheme.colorScheme.background
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(R.string.statistics),
            color = MaterialTheme.colorScheme.secondary,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )

        HabitChart(
            modifier = Modifier
                .padding(15.dp)
                .background(MaterialTheme.colorScheme.background)
                .fillMaxWidth()
                .height(300.dp)
                .border(1.dp, color = MaterialTheme.colorScheme.primary)
        )
    }
}