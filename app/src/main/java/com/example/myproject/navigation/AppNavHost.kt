package com.example.myproject.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myproject.ui.theme.screeens.Homescreen.HomeScreen
import com.example.myproject.ui.theme.screeens.RegistrationScreen.RegisterScreen
import com.example.myproject.ui.theme.screeens.studentlogin.LoginScreen

@Composable
fun AppNavHost(
    modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination:String = ROUTE_REGISTER){
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ){
        composable(ROUTE_HOME){ HomeScreen(navController)}
//        composable(ROUTE_SPLASHSCREEN){ SplashScreen(navController) }
        composable(ROUTE_REGISTER){ RegisterScreen(navController) }
        composable(ROUTE_LOGIN){ LoginScreen(navController) }

//        composable(ROUTE_GALLERY){ GalleryScreen(navController)}
//        composable(ROUTE_PROFILE){ ProfileScreen(navController)}
//        composable(ROUTE_ADD_PRODUCT){ AddProductsScreen(navController)}
//        composable(ROUTE_VIEW_PRODUCT){ ViewProductsScreen(navController)}
//        composable(ROUTE_VIEW_UPLOAD){ ViewUploadsScreen(navController)}
  //      composable(ROUTE_UPDATE_PRODUCT+"/{id}"){
//                passedData ->
//            UpdateProductsScreen(
//                navController,passedData.arguments?.getString("id")!!
        //)
        }
    }

//}
