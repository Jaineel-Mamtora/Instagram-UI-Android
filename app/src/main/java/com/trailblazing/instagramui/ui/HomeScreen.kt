package com.trailblazing.instagramui.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
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
import androidx.compose.ui.unit.sp
import com.trailblazing.instagramui.Post
import com.trailblazing.instagramui.R
import com.trailblazing.instagramui.StoryItem
import com.trailblazing.instagramui.ui.theme.Black
import com.trailblazing.instagramui.ui.theme.White
import com.trailblazing.instagramui.ui.theme.inter

@Composable
fun HomeScreen() {
    val posts: List<Post> = listOf(
        Post(
            username = "iambilly",
            likes = "248",
            postDate = "16th May, 2022",
            iconId = R.drawable.dp_image,
            imageId = R.drawable.skateboarding_man,
        ),
        Post(
            username = "angel_doll",
            likes = "509",
            postDate = "12th May, 2022",
            iconId = R.drawable.dp_image3,
            imageId = R.drawable.deer_image,
        ),
        Post(
            username = "butterscotch",
            likes = "364",
            postDate = "6th May, 2022",
            iconId = R.drawable.dp_image5,
            imageId = R.drawable.sunrise_image,
        ),
        Post(
            username = "foxy",
            likes = "655",
            postDate = "2nd May, 2022",
            iconId = R.drawable.dp_image7,
            imageId = R.drawable.fantasy_space,
        ),
    )

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
                            .width(110.dp)
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
                                modifier = Modifier.size(30.dp)
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.ic_messenger),
                                contentDescription = "Send Message",
                                tint = Black,
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }
                },
                elevation = 1.dp,
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            item {
                StoriesSection(
                    stories = listOf(
                        StoryItem(
                            userName = "Your Story",
                            iconId = R.drawable.dp_image
                        ),
                        StoryItem(
                            userName = "ablative",
                            iconId = R.drawable.dp_image2
                        ),
                        StoryItem(
                            userName = "angel_doll",
                            iconId = R.drawable.dp_image3
                        ),
                        StoryItem(
                            userName = "born2pizza",
                            iconId = R.drawable.dp_image4
                        ),
                        StoryItem(
                            userName = "butterscotch",
                            iconId = R.drawable.dp_image5
                        ),
                        StoryItem(
                            userName = "dawnofdusk",
                            iconId = R.drawable.dp_image6
                        ),
                        StoryItem(
                            userName = "foxy",
                            iconId = R.drawable.dp_image7
                        ),
                        StoryItem(
                            userName = "hakunamatata",
                            iconId = R.drawable.dp_image8
                        ),
                    )
                )
                Divider(thickness = 0.5.dp)
            }
            items(posts.size) {
                PostSection(post = posts[it])
            }
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
    Column {
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
                        .size(40.dp)
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
                Spacer(modifier = Modifier.width(20.dp))
                Icon(
                    painter = painterResource(id = R.drawable.ic_chat),
                    contentDescription = "Comment",
                    tint = Black,
                    modifier = Modifier
                        .size(28.dp),
                )
                Spacer(modifier = Modifier.width(20.dp))
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
        Text(
            "${post.likes} likes",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,
                fontFamily = inter
            ),
            modifier = Modifier.padding(start = 15.dp)
        )
        Text(
            "${post.username} ❤💯",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontFamily = inter,
                fontSize = 13.sp,
            ),
            modifier = Modifier.padding(start = 15.dp)
        )
        Text(
            "Posted on: ${post.postDate}",
            style = TextStyle(
                fontFamily = inter,
                fontSize = 10.sp,
                color = Color.Gray,
            ),
            modifier = Modifier.padding(start = 15.dp, top = 5.dp, bottom = 10.dp)
        )
    }
}

@Composable
fun StoryCard(
    storyItem: StoryItem,
    size: Dp
) {
    Column(
        horizontalAlignment = CenterHorizontally,
        modifier = Modifier.width(size)
    ) {
        Box(
            modifier = Modifier
                .border(2.dp, Color.Red, CircleShape)
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
                .padding(top = 3.dp)
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = storyItem.userName,
                style = MaterialTheme.typography.body2,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,

                )
        }
    }
}