package com.ashish.zomatoclone.screens.bottomNavBar

import androidx.compose.foundation.background
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ashish.zomatoclone.screens.NavGraphs
import com.ashish.zomatoclone.screens.appCurrentDestinationAsState
import com.ashish.zomatoclone.screens.destinations.Destination
import com.ashish.zomatoclone.screens.startAppDestination
import com.ashish.zomatoclone.ui.theme.zDarkGray
import com.ashish.zomatoclone.ui.theme.zRedColor


@Composable
fun BottomNavBar(
    navigator: DestinationsNavigator,
    navController: NavController
) {
    val currentDestination: Destination = navController.appCurrentDestinationAsState().value
        ?: NavGraphs.root.startAppDestination

    BottomNavigation {
        BottomBarNav.values().forEach {
            BottomNavigationItem(
                selected = currentDestination == it.direction,
                onClick = {
                    navigator.navigate(it.direction)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = it.icon),
                        contentDescription = stringResource(it.label)
                    )
                },
                label = { Text(text = stringResource(it.label), color = Color.DarkGray) },
                modifier = Modifier.background(Color.White),
                unselectedContentColor = zDarkGray,
                selectedContentColor = zRedColor
            )
        }
    }
}
