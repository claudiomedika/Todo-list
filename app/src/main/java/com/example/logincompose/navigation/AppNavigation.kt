package com.example.logincompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.logincompose.ui.login.LoginScreen
import com.example.logincompose.ui.cadastro.CadastroScreen
import com.example.logincompose.ui.todolist.TodoListScreen
import com.example.logincompose.ui.todolist.AddTodoScreen
import com.example.logincompose.navigation.Screen
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateListOf


@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val todoList = remember { mutableStateListOf<String>() }

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

        composable(Screen.TodoList.route) {
            TodoListScreen(navController, todoList)
        }

        composable(Screen.AddTodo.route) {
            AddTodoScreen(navController, todoList)
        }
    }
}

