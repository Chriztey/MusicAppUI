package com.chris.musicappui.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.chris.musicappui.R
val categories = listOf("Hits","Happy","Workout","Running","Yoga","TGIF")
@OptIn(ExperimentalFoundationApi::class)
@Composable

fun Home() {

    val grouped = listOf<String>("New Release","Favorites","Top Rated").groupBy { it[0] }

    LazyColumn{
        grouped.forEach{
            stickyHeader {
                Text(text = it.value[0], modifier = Modifier.padding(16.dp))
                LazyRow(
//                    modifier = Modifier
//                        .fillMaxWidth() // Ensure LazyRow occupies the entire width
//                        .padding(horizontal = 16.dp), // Apply horizontal padding
//                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    items(categories){
                        cat -> BrowserItem(
                            cat= cat,
                            drawable = R.drawable.ic_browse
                        )
                    }
                }
            }
        }
    }

}


@Composable

fun BrowserItem(
    cat: String,
    drawable: Int
){
    Card(
        modifier = Modifier
            .padding(16.dp)
            .size(200.dp),
        border = BorderStroke(3.dp, color = Color.DarkGray),
        content = {
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 8.dp) // Add vertical padding
            ){
                Text(text = cat, modifier = Modifier.align(Alignment.CenterHorizontally))
                Image(painter = painterResource(id = drawable), contentDescription = cat )
            }
        }
    )

}