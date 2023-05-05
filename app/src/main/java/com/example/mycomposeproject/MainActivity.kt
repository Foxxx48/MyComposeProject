package com.example.mycomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val lesson2 = Lesson2()
        setContent {
            lesson2.MultiplicationTable()
        }
    }
}

@Preview
@Composable
fun HelloUserPreview() {
MyTable(s = 1, r = 10)
}

@Composable
fun MyTable(s: Int, r: Int) {
    Column(
        modifier = Modifier
        .fillMaxSize()
    ) {
        for(i in s .. r) {
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxSize()
                    .weight(1f)
                    .border(1.dp, Color.Black),
                contentAlignment = Alignment.Center
            ){
                Text(text = "$i")
            }

        }
    }
}

