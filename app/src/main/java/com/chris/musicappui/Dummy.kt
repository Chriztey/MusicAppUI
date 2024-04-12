package com.chris.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<Lib>(
    Lib(R.drawable.ic_playlist, "Playlist"),
    Lib(R.drawable.ic_singer, "Artists"),
    Lib(R.drawable.ic_albu, "Album"),
    Lib(R.drawable.ic_song, "Songs"),
    Lib(R.drawable.ic_genre, "Genre")
)
