package com.example.logincompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.logincompose.ui.login.LoginScreen
import com.example.logincompose.ui.cadastro.CadastroScreen
import com.example.logincompose.ui.home.HomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(Screen.Login.route) {
            LoginScreen(navController)
        }
        composable(Screen.Cadastro.route) {
            CadastroScreen(navController)
        }
        composable(Screen.Home.route) {
            HomeScreen()
        }
    }
}
