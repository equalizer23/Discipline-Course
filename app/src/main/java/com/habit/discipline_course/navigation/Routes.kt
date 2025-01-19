package com.habit.discipline_course.navigation

import kotlinx.serialization.Serializable

sealed class Routes {
    @Serializable data object Home: Routes()
    @Serializable data object CreateHabit: Routes()
    @Serializable data object Splash: Routes()
    @Serializable data object Settings: Routes()
    @Serializable data class HabitDetails(val habitId: String): Routes()
    @Serializable data object NotificationSettings: Routes()
}