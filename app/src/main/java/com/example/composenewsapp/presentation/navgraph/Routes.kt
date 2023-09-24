package com.example.composenewsapp.presentation.navgraph


sealed class Routes(
    val route: String
) {
    object OnBoardingScreen: Routes("onBoardingScreen")
    object HomeScreen: Routes("homeScreen")
    object SearchScreen: Routes("searchScreen")
    object BookmarkScreen: Routes("bookmarkScreen")
    object DetailsScreen: Routes("detailsScreen")
    object AppStartNavigation: Routes("appStartNavigation")
    object NewsNavigation: Routes("newsNavigation")
    object NewsNavigatorScreen: Routes("newsNavigator")
}
