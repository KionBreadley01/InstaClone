package com.example.intagramproject.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.intagramproject.profile.components.ProfileDescription
import com.example.intagramproject.profile.components.ProfileHeader
import com.example.intagramproject.profile.components.ProfileInformation

@Composable
fun ProfileScreen() {
    val user = User(
        username = "KionSanchez",
        profileImageUrl = "https://via.placeholder.com/200",
        posts = 15,
        followers = 388,
        following = 288,
        name = "KionSanchez",
        description = "Mi gran description"
    )
    Column {
        ProfileHeader(
            backClick = { /*TODO*/ },
            notificationClick = { /*TODO*/ },
            optionClick = { /*TODO*/ },
            username = user.username
        )
        ProfileInformation(
            ImageUrl = user.profileImageUrl,
            posts = user.posts,
            followers = user.followers,
            following = user.following,
        )
        ProfileDescription(
            name = user.name,
            description = user.description,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 4.dp))
    }
}
@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview(){
    ProfileScreen()

}
