package com.example.nestednavigationwithbottombar.navgation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.nestednavigationwithbottombar.navgation.auth.AuthScreen
import com.example.nestednavigationwithbottombar.screens.LoginContent
import com.example.nestednavigationwithbottombar.screens.ScreenContent

fun NavGraphBuilder.authNavGrahp(navContoler: NavHostController) {
    navigation(
        route  = Grahp.AUTHECATION,
        startDestination = AuthScreen.Login.route
    )
    {
        composable(route = AuthScreen.Login.route) {
            LoginContent(
                onClick = {
                    navContoler.popBackStack()
                    navContoler.navigate(Grahp.Home)
                },
                onSignUpClick = {
                    navContoler.navigate(AuthScreen.SignUp.route)
                },
                onForgotClick = {
                    navContoler.navigate(AuthScreen.Forget.route)
                }
            )
        }

        composable(route = AuthScreen.SignUp.route) {
            ScreenContent(
                name = AuthScreen.SignUp.route
            ) {}
        }
        composable(route = AuthScreen.Forget.route) {
            ScreenContent(
                name = AuthScreen.Forget.route
            ) {}
        }

    }
}