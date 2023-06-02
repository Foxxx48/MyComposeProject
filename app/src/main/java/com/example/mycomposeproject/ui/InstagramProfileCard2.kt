package com.example.mycomposeproject.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycomposeproject.R

@Preview
@Composable
fun InstagramProfileCard2() {

    val isFollowed = rememberSaveable() {
        mutableStateOf(false)
    }

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
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    modifier = Modifier
                        .size(50.dp),
                    painter = painterResource(id = R.drawable.ic_instagram),
                    contentDescription = ""
                )

                UserStatistics("Posts", "1.345")
                UserStatistics("Followers", "436M")
                UserStatistics("Following", "77")
            }

            Text(
                text = "Instagram",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                fontFamily = FontFamily.Cursive
            )
            Text(
                text = "#YoursToMake",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
            )
            Text(
                text = "www.facebook.com/emotional_health",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp
            )
            FollowButton(isFollowed = isFollowed.value) {
                isFollowed.value = !isFollowed.value
            }
        }
    }
}

@Composable
fun FollowButton(isFollowed: Boolean, clickListener: () -> Unit) {
    Button(
        onClick = {
            clickListener()
        }, colors = buttonColors(
            backgroundColor = if (isFollowed) {
                MaterialTheme.colors.primary.copy(0.5F)
            } else {
                MaterialTheme.colors.primary
            }
        )
    ) {
        val text = if (isFollowed) {
            "Unfollow"
        } else {
            "Follow"
        }
        Text(text = text)
    }
}

@Composable
private fun UserStatistics(title: String, value: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = value,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            fontFamily = FontFamily.Cursive
        )

        Text(
            text = title,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            fontSize = 10.sp,
        )
    }
}



