package Bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "screen_1" ){
        composable("screen_1"){
            Screens1()
        }
        composable("screen_2"){
            Screens2()
        }
        composable("screen_3"){
            Screens3()
        }

    }
}