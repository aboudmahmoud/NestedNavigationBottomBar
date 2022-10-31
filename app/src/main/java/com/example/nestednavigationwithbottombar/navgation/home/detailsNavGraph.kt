package com.example.nestednavigationwithbottombar.navgation.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.nestednavigationwithbottombar.navgation.Grahp
import com.example.nestednavigationwithbottombar.screens.ScreenContent

fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
    navigation(
        route = Grahp.DETIALS,
        startDestination = DetailsScreen.Information.route
    ) {
        composable(route = DetailsScreen.Information.route) {
            ScreenContent(name = DetailsScreen.Information.route) {
                navController.navigate(DetailsScreen.Overview.route)
            }
        }
        composable(route = DetailsScreen.Overview.route) {
            ScreenContent(name = DetailsScreen.Overview.route) {
                navController.popBackStack(
                    route = DetailsScreen.Information.route,
                    inclusive = false
                )
            }
        }
    }
}