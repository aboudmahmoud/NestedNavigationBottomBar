package com.example.nestednavigationwithbottombar.navgation


import android.telecom.Call.Details
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nestednavigationwithbottombar.screens.HomeScreen


@ExperimentalMaterial3Api
@Composable
fun RootNabGarph(
    navContoler: NavHostController
) {
    NavHost(
        navController =navContoler ,
        startDestination = Grahp.AUTHECATION,
        route = Grahp.Root
    ){
        authNavGrahp(navContoler=navContoler)
        composable(route =Grahp.Home ){
            HomeScreen()
        }
    }
}



