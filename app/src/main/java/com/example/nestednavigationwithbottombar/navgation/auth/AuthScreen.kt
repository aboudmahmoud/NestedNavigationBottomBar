package com.example.nestednavigationwithbottombar.navgation.auth

sealed  class AuthScreen(
    val route:String
){
    object Login:AuthScreen(route = "Login_up")
    object SignUp:AuthScreen(route = "Sign_Up")
    object Forget:AuthScreen(route = "Forget")

}
