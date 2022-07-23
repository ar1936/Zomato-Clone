package com.ashish.zomatoclone.screens.bottomNavBar

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec
import com.ashish.zomatoclone.R
import com.ashish.zomatoclone.screens.destinations.DiningScreenDestination
import com.ashish.zomatoclone.screens.destinations.HomeScreenDestination

enum class BottomBarNav(
    val direction: DirectionDestinationSpec,
    @DrawableRes val icon: Int,
    @StringRes val label: Int
) {
    Home(HomeScreenDestination, R.drawable.delivery_bottom_nav, R.string.delivery_bottom_nav),
    Dining(DiningScreenDestination, R.drawable.local_dining_bottom_nav, R.string.dining_bottom_nav)
}
