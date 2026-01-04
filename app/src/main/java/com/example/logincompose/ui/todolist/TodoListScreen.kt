package com.example.logincompose.ui.todolist

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.logincompose.navigation.Screen

@Composable
fun TodoListScreen(
    navController: NavController,
    todoList: List<String>
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text("Minha Todo List", fontSize = 26.sp)

        Spacer(modifier = Modifier.height(16.dp))

        if (todoList.isEmpty()) {
            Text("Nenhuma tarefa adicionada")
        } else {
            todoList.forEach {
                Text("• $it")
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = {
                navController.navigate(Screen.AddTodo.route)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Adicionar tarefa")
        }
    }
}
