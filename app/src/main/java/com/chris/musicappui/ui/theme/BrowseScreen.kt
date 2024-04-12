package com.chris.musicappui.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.chris.musicappui.R


@Composable

fun BrowseScreen () {
    // val categories = listOf("Hits","Happy","Workout","Yoga","TGIF")

    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(categories) {
            cat ->
            BrowserItem(cat = cat, drawable = R.drawable.ic_browse)
            // DisplayCatName(name = cat)
        }
        }
    }

@Composable
fun DisplayCatName(name:String) {
    Column (modifier = Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = name)
    }
}

