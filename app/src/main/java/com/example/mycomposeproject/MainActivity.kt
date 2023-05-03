package com.example.mycomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloUser(name = "Dmitry", age = 39 )

        }
    }
}

@Composable
fun HelloUser(name: String, age: Int) {
    Text(
        text = "Hello $name! You are $age years old."
    )
}

