package com.example.logincompose.navigation

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Cadastro : Screen("cadastro")
    object Home : Screen("home")
}
