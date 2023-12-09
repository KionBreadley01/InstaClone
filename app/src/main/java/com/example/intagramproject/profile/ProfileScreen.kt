package com.example.intagramproject.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.intagramproject.profile.components.ProfileAction
import com.example.intagramproject.profile.components.ProfileDescription
import com.example.intagramproject.profile.components.ProfileHeader
import com.example.intagramproject.profile.components.ProfileInformation
import com.example.intagramproject.profile.components.ProfileStoryHighlight


@Composable
fun ProfileScreen() {
    val user = User(
        username = "KionSanchez",
        profileImageUrl = "https://via.placeholder.com/100",
        followers = 388,
        following = 288,
        name = "KionSanchez",
        description = "Mi gran description",
        stories = listOf(
            Story(image ="https://via.placeholder.com/100", text ="Story 1"),
            Story(image ="https://via.placeholder.com/100", text ="Story 2"),
            Story(image ="https://via.placeholder.com/100", text ="Story 3"),
            Story(image ="https://via.placeholder.com/100", text ="Story 4"),
            Story(image ="https://via.placeholder.com/100", text ="Story 5"),
            Story(image ="https://via.placeholder.com/100", text ="Story 6"),
            Story(image ="https://via.placeholder.com/100", text ="Story 7"),
            Story(image ="https://via.placeholder.com/100", text ="Story 8")
        ),
        posts = listOf()
    )
    Column {
        ProfileHeader(
            backClick = { /*TODO*/ },
            notificationClick = { /*TODO*/ },
            optionClick = { /*TODO*/ },
            username = user.username
        )
        ProfileInformation(
            imageUrl = user.profileImageUrl,
            posts = user.posts.size,
            followers = user.followers,
            following = user.following,
        )
        ProfileDescription(
            name = user.name,
            description = user.description,
            modifier = Modifier.padding(start = 14.dp, end = 14.dp, top = 2.dp, bottom = 2.dp)
        )
        ProfileAction(
            modifier = Modifier.padding(start = 13.dp, end = 13.dp)
        )
        ProfileStoryHighlight(
            stories = user.stories,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp)
        )
    }
}
@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview(){
    ProfileScreen()

}
