package com.example.odev4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Screens(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home"){

        composable("home"){
            Home(navController=navController)
        }
        composable("PageB"){
            PageB(navController = navController)
        }
        composable("PageA"){
            PageA(navController = navController)
        }
        composable("PageX"){
            PageX(navController = navController)
        }
        composable("PageY"){
            PageY(navController = navController)

        }
        

    }

}