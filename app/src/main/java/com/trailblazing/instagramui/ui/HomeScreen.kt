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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trailblazing.instagramui.Post
import com.trailblazing.instagramui.R
import com.trailblazing.instagramui.StoryItem
import com.trailblazing.instagramui.ui.theme.Black
import com.trailblazing.instagramui.ui.theme.White
import com.trailblazing.instagramui.ui.theme.inter

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
        Column() {
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
            Divider(thickness = 0.5.dp)
            PostSection(
                post = Post(
                    username = "iambilly",
                    iconId = R.drawable.dp_image,
                    imageId = R.drawable.sunrise_image,
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
            .absolutePadding(top = 10.dp)
            .height(105.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(horizontal = 10.dp)
    ) {
        items(stories.size) {
            StoryCard(storyItem = stories[it], 75.dp)
        }
    }
}

@Composable
fun PostSection(
    post: Post
) {
    Spacer(modifier = Modifier.height(10.dp))
    Column() {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .absolutePadding(left = 10.dp, right = 15.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(
                    modifier = Modifier
                        .border(1.dp, Color.Red, CircleShape)
                        .border(3.dp, Color.White, CircleShape)
                        .size(35.dp)
                ) {
                    Image(
                        painter = painterResource(id = post.iconId),
                        contentDescription = "display picture",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(CircleShape)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    post.username,
                    style = TextStyle(fontWeight = FontWeight.Bold, fontFamily = inter)
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.ic_three_dots_vertical),
                contentDescription = "Add Content",
                tint = Black,
                modifier = Modifier.size(15.dp)
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Divider(thickness = 0.5.dp)
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(380.dp),
            painter = painterResource(id = post.imageId),
            contentDescription = "Post photo",
            contentScale = ContentScale.Crop,
        )
        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 12.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_heart),
                    contentDescription = "Like",
                    tint = Black,
                    modifier = Modifier
                        .size(26.dp),

                )
                Spacer(modifier = Modifier.width(25.dp))
                Icon(
                    painter = painterResource(id = R.drawable.ic_chat),
                    contentDescription = "Comment",
                    tint = Black,
                    modifier = Modifier
                        .size(28.dp),
                )
                Spacer(modifier = Modifier.width(25.dp))
                Icon(
                    painter = painterResource(id = R.drawable.ic_send),
                    contentDescription = "Send",
                    tint = Black,
                    modifier = Modifier.size(26.dp)
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.ic_bookmark),
                contentDescription = "Bookmark",
                tint = Black,
                modifier = Modifier.size(26.dp)
            )
        }
    }
}

@Composable
fun StoryCard(
    storyItem: StoryItem,
    size: Dp
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = Modifier
                .border(1.dp, Color.Red, CircleShape)
                .border(5.dp, Color.White, CircleShape)
                .size(size)
        ) {
            Image(
                painter = painterResource(id = storyItem.iconId),
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
                text = storyItem.userName,
                style = MaterialTheme.typography.body2,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}