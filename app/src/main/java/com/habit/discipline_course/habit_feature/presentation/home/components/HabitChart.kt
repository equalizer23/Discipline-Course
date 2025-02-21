package com.habit.discipline_course.habit_feature.presentation.home.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import co.yml.charts.axis.AxisData
import co.yml.charts.common.model.Point
import co.yml.charts.ui.barchart.BarChart
import co.yml.charts.ui.barchart.models.BarChartData
import co.yml.charts.ui.barchart.models.BarData
import co.yml.charts.ui.barchart.models.BarStyle

@Composable
fun HabitChart(modifier: Modifier = Modifier) {
    val barData = mutableListOf(
        BarData(point = Point(x = 1f, y = 1f), label = "1 Jan", color = MaterialTheme.colorScheme.primary),
        BarData(point = Point(x = 2f, y = 2f), label = "2 Jan", color = MaterialTheme.colorScheme.primary),
        BarData(point = Point(x = 3f, y = 3f), label = "3 Jan", color = MaterialTheme.colorScheme.primary),
        BarData(point = Point(x = 4f, y = 4f), label = "4 Jan", color = MaterialTheme.colorScheme.primary),
        BarData(point = Point(x = 5f, y = 3f), label = "5 Jan", color = MaterialTheme.colorScheme.primary)
    )

    val xAxisData = AxisData.Builder()
        .axisLineColor(MaterialTheme.colorScheme.secondary)
        .steps(5)
        .axisLabelColor(MaterialTheme.colorScheme.secondary)
        .bottomPadding(20.dp)
        .labelData { index -> barData[index].label }
        .shouldDrawAxisLineTillEnd(true)
        .startDrawPadding(30.dp)
        .endPadding(0.dp)
        .build()

    val yAxisData = AxisData.Builder()
        .axisLineColor(MaterialTheme.colorScheme.secondary)
        .backgroundColor(MaterialTheme.colorScheme.background)
        .steps(5)
        .axisLabelColor(MaterialTheme.colorScheme.secondary)
        .labelAndAxisLinePadding(20.dp)
        .labelData { index -> index.toString() }
        .shouldDrawAxisLineTillEnd(true)
        .build()

    val barChartData = BarChartData(
        chartData = barData,
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        paddingEnd = 0.dp,
        backgroundColor = MaterialTheme.colorScheme.background,
        barStyle = BarStyle(paddingBetweenBars = 20.dp, barWidth = 25.dp),
        showXAxis = true,
        showYAxis = true,
        horizontalExtraSpace = 10.dp
    )

    Box(modifier = modifier){
        BarChart(modifier = Modifier.fillMaxSize(), barChartData = barChartData)
    }
}