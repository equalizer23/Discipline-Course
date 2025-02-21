package com.habit.discipline_course.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.habit.discipline_course.habit_feature.presentation.create_habit.CreateHabitScreen
import com.habit.discipline_course.habit_feature.presentation.habit_details.HabitDetailsScreen
import com.habit.discipline_course.habit_feature.presentation.home.HomeScreen
import com.habit.discipline_course.habit_feature.presentation.notification_settings.NotificationSettingsScreen
import com.habit.discipline_course.habit_feature.presentation.settings.SettingsScreen
import com.habit.discipline_course.habit_feature.presentation.splash.SplashScreen

@Composable
fun NavigationRoot() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.Home
    ){
        composable<Routes.Splash>{
            SplashScreen(toHome = { navController.navigate(Routes.Home) })
        }

        composable<Routes.Home>{
            HomeScreen(
                onFabClick = {
                    navController.navigate(Routes.CreateHabit)
                },
                onSettingsClick = { navController.navigate(Routes.Settings) },
                onHabitClick = { habitId ->
                    navController.navigate(Routes.HabitDetails(habitId = habitId))
                }
            )
        }

        composable<Routes.HabitDetails>{
            HabitDetailsScreen(onBackClick = { navController.popBackStack() })
        }

        composable<Routes.Settings>{
            SettingsScreen(onBackClick = { navController.popBackStack() }, toNotificationSettings = { navController.navigate(Routes.NotificationSettings) })
        }

        composable<Routes.NotificationSettings>{
            NotificationSettingsScreen(onBackClick = { navController.popBackStack() })
        }

        composable<Routes.CreateHabit>{
            CreateHabitScreen(onBackClick = { navController.popBackStack() })
        }
    }
}