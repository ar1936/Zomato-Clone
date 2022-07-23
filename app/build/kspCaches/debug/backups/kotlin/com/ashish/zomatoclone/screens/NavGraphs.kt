package com.ashish.zomatoclone.screens

import com.ashish.zomatoclone.screens.destinations.*
import com.ramcosta.composedestinations.spec.*

/**
 * Class generated if any Composable is annotated with `@Destination`.
 * It aggregates all [TypedDestination]s in their [NavGraph]s.
 */
object NavGraphs {

    val root = NavGraph(
        route = "root",
        startRoute = LoginScreenDestination,
        destinations = listOf(
            CountryPickerScreenDestination,
			DiningScreenDestination,
			HomeScreenDestination,
			LoginScreenDestination,
			RestaurantScreenDestination
        )
    )
}