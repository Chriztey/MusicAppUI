package com.chris.musicappui.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.chris.musicappui.Lib
import com.chris.musicappui.libraries


@Composable

fun Library () {
    LazyColumn(Modifier.padding(10.dp)) {
        items(libraries) { lib -> LibItem(lib = lib)
        }
    }
}

@Composable

fun LibItem (lib: Lib) {
    Column () {
        Row(
            Modifier
                .fillMaxSize()
                .padding(16.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Row {
                Image(painter = painterResource(id = lib.icon), contentDescription = "")
                Text(text = lib.name)
            }
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "")
        }
        Divider(thickness = 3.dp)
    }
}
