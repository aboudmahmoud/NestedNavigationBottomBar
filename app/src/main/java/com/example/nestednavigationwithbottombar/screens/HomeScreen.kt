package com.example.nestednavigationwithbottombar.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.ContentAlpha
import androidx.compose.material3.*

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.nestednavigationwithbottombar.BottmaBarScreen

import com.example.nestednavigationwithbottombar.navgation.home.HomeNavGraph

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun HomeScreen(
    navHostController: NavHostController = rememberNavController()
) {
Scaffold(
    bottomBar = {BottmBar(navHostController=navHostController)}
) {
HomeNavGraph(navContoler=navHostController)
}
}

@Composable
fun BottmBar(navHostController: NavHostController) {
val screens = listOf(
    BottmaBarScreen.Home,
    BottmaBarScreen.Settings,
    BottmaBarScreen.Profile
)
    val navBackStackEntary by navHostController.currentBackStackEntryAsState()
    val cureentDesnation = navBackStackEntary?.destination

    val bottomBarDestantio=screens.any{it.route == cureentDesnation?.route}
    if (bottomBarDestantio){
        NavigationBar {
            screens.forEach {
                screen-> AddItem(
                screen=screen,
                cureentDesnation=cureentDesnation,
                navHostController = navHostController
                )
            }
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottmaBarScreen,
    cureentDesnation: NavDestination?,
    navHostController: NavHostController
) {
    NavigationBarItem(
        label = {
            Text(text = screen.title)
        },
        icon ={
            Icon(imageVector =screen.icon , contentDescription ="barIcon" )
        },
        selected = cureentDesnation?.hierarchy?.any{
            it.route== screen.route
        }==true,
        onClick = {
            navHostController.navigate(screen.route){
                popUpTo(navHostController.graph.findStartDestination().id)
                launchSingleTop=true
            }
        },     colors = NavigationBarItemDefaults.colors(
            unselectedIconColor =  LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
            unselectedTextColor =  LocalContentColor.current.copy(alpha = ContentAlpha.disabled),


        )

    )
}
