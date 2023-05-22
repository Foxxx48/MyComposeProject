package com.example.mycomposeproject

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Lesson4 {
    @Preview
    @Composable
    fun CardTest() {
        Card(
            shape = RoundedCornerShape(
                topStart = 4.dp,
                topEnd = 4.dp
            ),
            backgroundColor = Color.Green,
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text = "Hello world!")
        }

    }
}