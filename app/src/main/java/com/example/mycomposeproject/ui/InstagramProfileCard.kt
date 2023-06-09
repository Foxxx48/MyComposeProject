package com.example.mycomposeproject.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycomposeproject.ui.theme.MyComposeProjectTheme


@Composable
fun InstagramProfileCard() {
    Card(
        modifier = Modifier
            .padding(8.dp),
        shape = RoundedCornerShape(
           topStart = 4.dp,
            topEnd = 4.dp
        ),
        backgroundColor = MaterialTheme.colors.background,
        border = BorderStroke(1.dp, MaterialTheme.colors.onBackground)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Box(
                modifier = Modifier
                    .background(Color.Green)
                    .size(50.dp),
            ) {

            }
            TwoBoxes()
            TwoBoxes()
            TwoBoxes()
        }
    }

}

@Composable
private fun TwoBoxes() {
    Column(
        modifier = Modifier
            .height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(
            modifier = Modifier
                .size(25.dp)
                .background(Color.Blue)
        ) {

        }

        Box(
            modifier = Modifier
                .size(25.dp)
                .background(Color.Red)
        ) {

        }


    }

}

@Preview
@Composable
fun PreviewCardLight() {
    MyComposeProjectTheme(
        darkTheme = false
    ) {
        InstagramProfileCard()
    }
}

@Preview
@Composable
fun PreviewCardDark() {
    MyComposeProjectTheme(
        darkTheme = true
    ) {
        InstagramProfileCard()
    }

}