package com.habit.discipline_course.navigation


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationRoot() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.Splash
    ){
        composable<Routes.Splash>{
            Box(modifier = Modifier.fillMaxSize()){  }
        }

        composable<Routes.Home>{
            Box(modifier = Modifier.fillMaxSize()){  }
        }

        composable<Routes.HabitDetails>{
            Box(modifier = Modifier.fillMaxSize()){  }
        }

        composable<Routes.Settings>{
            Box(modifier = Modifier.fillMaxSize()){  }
        }

        composable<Routes.NotificationSettings>{
            Box(modifier = Modifier.fillMaxSize()){  }
        }

        composable<Routes.CreateHabit>{
            Box(modifier = Modifier.fillMaxSize()){  }
        }
    }
}