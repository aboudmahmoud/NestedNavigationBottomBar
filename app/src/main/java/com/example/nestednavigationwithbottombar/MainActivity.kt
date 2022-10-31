package com.example.nestednavigationwithbottombar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.nestednavigationwithbottombar.navgation.RootNabGarph
import com.example.nestednavigationwithbottombar.ui.theme.NestedNavigationWithBottomBarTheme
@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NestedNavigationWithBottomBarTheme {
                // A surface container using the 'background' color from the theme

                RootNabGarph(navContoler=rememberNavController())
            }
        }
    }
}

