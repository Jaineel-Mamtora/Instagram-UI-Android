package com.trailblazing.instagramui.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.trailblazing.instagramui.R
import com.trailblazing.instagramui.StoryItem
import com.trailblazing.instagramui.ui.theme.Black
import com.trailblazing.instagramui.ui.theme.White

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
                    Box(
                        modifier = Modifier
                            .padding(top = 12.dp)
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
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
        ) {
            StoriesSection(
                stories = listOf(
                    StoryItem(
                        userName = "user1",
                        iconId = R.drawable.dp_image
                    ),
                    StoryItem(
                        userName = "user2",
                        iconId = R.drawable.dp_image
                    ),
                    StoryItem(
                        userName = "user3",
                        iconId = R.drawable.dp_image
                    ),
                    StoryItem(
                        userName = "user4",
                        iconId = R.drawable.dp_image
                    ),
                    StoryItem(
                        userName = "user5",
                        iconId = R.drawable.dp_image
                    ),
                    StoryItem(
                        userName = "user6",
                        iconId = R.drawable.dp_image
                    ),
                    StoryItem(
                        userName = "user7",
                        iconId = R.drawable.dp_image
                    ),
                    StoryItem(
                        userName = "user8",
                        iconId = R.drawable.dp_image
                    ),
                )
            )
        }
    }
}

@Composable
fun StoriesSection(
    stories: List<StoryItem>
) {
    LazyRow(
        modifier = Modifier
            .height(100.dp)
            .padding(top = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(stories.size) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Box(
                    modifier = Modifier
                        .border(1.dp, Color.Red, CircleShape)
                        .border(5.dp, Color.White, CircleShape)
                        .size(75.dp)
                ) {
                    Image(
                        painter = painterResource(id = stories[it].iconId),
                        contentDescription = "display picture",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(CircleShape)
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 3.dp)
                ) {
                    Text(
                        textAlign = TextAlign.Center,
                        text = stories[it].userName,
                        style = MaterialTheme.typography.body2,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}