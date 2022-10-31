package com.example.nestednavigationwithbottombar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottmaBarScreen(
val route:String,
val title:String,
val icon: ImageVector
){
    object Home:BottmaBarScreen(   route = "HOME",
        title = "HOME",
        icon = Icons.Default.Home)
    object Profile:BottmaBarScreen(  route = "PROFILE",
        title = "PROFILE",
        icon = Icons.Default.Person)
    object Settings:BottmaBarScreen(   route = "SETTINGS",
        title = "SETTINGS",
        icon = Icons.Default.Settings)
}
