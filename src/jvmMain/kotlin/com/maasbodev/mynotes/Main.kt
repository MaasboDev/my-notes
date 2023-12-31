package com.maasbodev.mynotes

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.maasbodev.mynotes.ui.App

fun main() {
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "My Notes"
        ) {
            App()
        }
    }
}
