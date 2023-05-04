package com.example.mycomposeproject

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class Lesson1 {

    @Preview
    @Composable
    fun HelloUserPreview() {
        HelloUser(name = "Dmitry", age = 39)
    }

    @Composable
    fun HelloUser(name: String, age: Int) {
        Column {
            repeat(10) {
                Text(text = "Hello $name! You are ${age + it} years old.")
            }
        }


    }
}