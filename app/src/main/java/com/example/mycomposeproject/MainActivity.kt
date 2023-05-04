package com.example.mycomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloUser(name = "Dmitry", age = 39)
        }
    }
}

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

