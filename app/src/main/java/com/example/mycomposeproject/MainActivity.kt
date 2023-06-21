package com.example.mycomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import com.example.mycomposeproject.ui.InstaCard
import com.example.mycomposeproject.ui.theme.MyComposeProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        setContent {
            MyComposeProjectTheme() {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colors.background)
                ) {

                    Test(viewModel)
                }

            }

        }
    }
}

@Composable
fun Test(
    viewModel: MainViewModel,
    modifier: Modifier = Modifier
) {
    val models = viewModel.instaModels.observeAsState(listOf())

    LazyColumn(
        modifier = modifier,
    ) {
        items(models.value) { model ->
            InstaCard(model = model, onFollowedButtonClicked = {
                viewModel.changeFollowingStatus(it)
            })
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
        for (i in s..r) {
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxSize()
                    .weight(1f)
                    .border(1.dp, Color.Black),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "$i")
            }

        }
    }
}

