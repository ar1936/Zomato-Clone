package com.ashish.zomatoclone.screens.homeScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ashish.zomatoclone.screens.commonComponents.FilterRowCard
import java.util.logging.Filter

@Composable
fun HomeScreenFilterItemRow(
    categories: List<HomeScreenFilterItems>,
    selectedCategory: HomeScreenFilterItems?,
) {
    var selectedChipIndex by remember {
        mutableStateOf(1)
    }
    Surface {
        val scrollState = rememberLazyListState()
        LazyRow(
            modifier = Modifier
                .background(Color.White)
                .padding(start = 10.dp),
            state = scrollState
        ) {
            items(categories) {
                FilterRowCard(
                    text = it.text,
                    isSelected = selectedCategory == it,
                    leadingIcon = it.leadingIcon,
                    trailingIcon = it.trailingIcon,
                    onClick = {}
                )
            }
//            for (category in getAllHomeScreenFilterItems()) {
//                items(1) {
//                    FilterRowCard(
//                        text = category.text,
//                        isSelected = selectedCategory == it,
//                        leadingIcon = category.leadingIcon,
//                        trailingIcon = category.trailingIcon,
//                        onClick = {}
//                    )
//                }
//            }
//            items(1) {
//                FilterRowCard(
//                    text = "Sort",
//                    leadingIcon = Icons.Default.Info,
//                    trailingIcon = Icons.Filled.ArrowDropDown,
//                    int = 1,
//                    test = selectedChipIndex,
//                    onClick = { selectedChipIndex = 1 }
//                )
//            }
//            items(1) {
//                FilterRowCard(
//                    text = "Fast Delivery",
//                    int = 2,
//                    test = selectedChipIndex,
//                    onClick = { selectedChipIndex = 2 }
//                )
//            }
//            items(1) {
//                FilterRowCard(
//                    text = "Pure Veg",
//                    int = 3,
//                    test = selectedChipIndex,
//                    onClick = { selectedChipIndex = 3 }
//                )
//            }
//            items(1) {
//                FilterRowCard(
//                    text = "Rating 4.0+",
//                    int = 4,
//                    test = selectedChipIndex,
//                    onClick = { selectedChipIndex = 4 }
//                )
//            }
//            items(1) {
//                FilterRowCard(
//                    text = "MAX Safety",
//                    int = 5,
//                    test = selectedChipIndex,
//                    onClick = { selectedChipIndex = 5 }
//                )
//            }
//            items(1) {
//                FilterRowCard(
//                    text = "Cuisines",
//                    trailingIcon = Icons.Filled.ArrowDropDown,
//                    int = 6,
//                    test = selectedChipIndex,
//                    onClick = { selectedChipIndex = 6 }
//                )
//            }
//            items(1) {
//                FilterRowCard(
//                    text = "New Arrivals",
//                    int = 5,
//                    test = selectedChipIndex,
//                    onClick = { selectedChipIndex = 5 }
//                )
//            }
//            items(1) {
//                FilterRowCard(
//                    text = "More",
//                    trailingIcon = Icons.Filled.ArrowDropDown,
//                    int = 5,
//                    test = selectedChipIndex,
//                    onClick = { selectedChipIndex = 5 }
//                )
//            }
        }
    }
}
