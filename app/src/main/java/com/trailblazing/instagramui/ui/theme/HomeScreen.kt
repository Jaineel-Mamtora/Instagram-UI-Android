package com.trailblazing.instagramui.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.trailblazing.instagramui.R

@Composable
fun HomeScreen() {
    Scaffold(
        modifier = Modifier
            .background(White)
            .fillMaxSize(),
        topBar = {
            TopAppBar(
                backgroundColor = White,
                title = {
                    Box (
                        modifier = Modifier
                            .padding(top = 12.dp, start = 4.dp)
                    ) {
                        Text(
                            text = " Instagram",
                            style = MaterialTheme.typography.h1,
                        )
                    }
                },
                actions = {
                    Box(
                        modifier = Modifier
                            .width(120.dp)
                            .height(26.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_add),
                                contentDescription = "Add Content",
                                tint = Black,
                                modifier = Modifier.size(26.dp)
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.ic_messenger),
                                contentDescription = "Send Message",
                                tint = Black,
                                modifier = Modifier.size(26.dp)
                            )
                        }
                    }
                },
                elevation = 0.dp,
            )
        }
    ) {}
}