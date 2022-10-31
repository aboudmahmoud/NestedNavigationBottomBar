package com.example.nestednavigationwithbottombar.navgation.home

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nestednavigationwithbottombar.BottmaBarScreen
import com.example.nestednavigationwithbottombar.navgation.Grahp
import com.example.nestednavigationwithbottombar.screens.ScreenContent


@Composable
fun HomeNavGraph(
    navContoler: NavHostController
) {
    NavHost(navController = navContoler,
        route = Grahp.Home,
        startDestination = BottmaBarScreen.Home.route){
        composable(route = BottmaBarScreen.Home.route) {
            ScreenContent(
                name = BottmaBarScreen.Home.route,
                onClick = {
                    navContoler.navigate(Grahp.DETIALS)
                }
            )
        }
        composable(route = BottmaBarScreen.Profile.route) {
            ScreenContent(
                name = BottmaBarScreen.Profile.route,
                onClick = { }
            )
        }
        composable(route = BottmaBarScreen.Settings.route) {
            ScreenContent(
                name = BottmaBarScreen.Settings.route,
                onClick = { }
            )
        }
        detailsNavGraph(navController = navContoler)
    }
}




