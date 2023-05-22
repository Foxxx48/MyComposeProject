package com.example.mycomposeproject

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Lesson2 {

    @Preview
    @Composable
    fun MultiplicationTable() {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            for (i in 1 until 10) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    for (j in 1 until 10) {

                        val color =
                        if ((i + j) % 2 == 0) {
                            Color.Yellow
                        } else {
                            Color.White
                        }
                            Box(
                                modifier = Modifier
                                    .background(color)
                                    .fillMaxSize()
                                    .weight(1f)
                                    .border(1.dp, Color.Black),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(text = "${i * j}")
                            }
                    }
                }
            }
        }
    }


}