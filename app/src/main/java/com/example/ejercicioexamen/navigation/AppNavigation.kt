package com.example.ejercicioexamen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ejercicioexamen.screens.*
import kotlin.random.Random

@Composable
fun AppNavigation() {

    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.Ejercicio7.route) {
        composable(AppScreens.DialogFlow.route) {
            DialogFlow(navController)
        }
        composable(AppScreens.Ejercicio7.route) {
            Ejercicio7(navController)
        }
        composable(AppScreens.Ejercicio8.route) {
            Ejercicio8(navController)
        }
        composable(AppScreens.Ejercicio9.route) {
            Ejercicio9(navController)
        }
        composable(AppScreens.Ejercicio10.route) {
            Ejercicio10(navController)
        }
        composable(AppScreens.Objeto.route) {
            Objeto(navController)
        }
        composable(AppScreens.Mercader.route) {
            Mercader(navController)
        }

        composable(AppScreens.Lucha.route) {
            Lucha(navController,Random.nextInt(0,5))
        }
        composable(AppScreens.Ciudad.route) {
            Ciudad(navController)
        }


    }
}