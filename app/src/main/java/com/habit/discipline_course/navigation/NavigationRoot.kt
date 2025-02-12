package com.habit.discipline_course.navigation


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.habit.discipline_course.habit_feature.presentation.create_habit.CreateHabitScreen
import com.habit.discipline_course.habit_feature.presentation.habit_details.HabitDetailsScreen
import com.habit.discipline_course.habit_feature.presentation.home.HomeScreen

@Composable
fun NavigationRoot() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.Home
    ){
        composable<Routes.Splash>{
            Box(modifier = Modifier.fillMaxSize()){  }
        }

        composable<Routes.Home>{
            HomeScreen(
                onFabClick = {
                    navController.navigate(Routes.CreateHabit)
                },
                onSettingsClick = {},
                onHabitClick = { habitId ->
                    navController.navigate(Routes.HabitDetails(habitId = habitId))
                }
            )
        }

        composable<Routes.HabitDetails>{
            HabitDetailsScreen(onBackClick = { navController.popBackStack() })
        }

        composable<Routes.Settings>{
            Box(modifier = Modifier.fillMaxSize()){  }
        }

        composable<Routes.NotificationSettings>{
            Box(modifier = Modifier.fillMaxSize()){  }
        }

        composable<Routes.CreateHabit>{
            CreateHabitScreen(onBackClick = { navController.popBackStack() })
        }
    }
}