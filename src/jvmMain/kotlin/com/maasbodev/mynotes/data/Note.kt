package com.maasbodev.mynotes.data

import com.maasbodev.mynotes.data.Note.Type
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

data class Note(
    val title: String,
    val description: String,
    val type: Type,
) {
    enum class Type { TEXT, AUDIO, }
}

operator fun Note.plus(other: Note) = Note(title, "$description + ${other.description}", type)

fun getNotes() = flow {
    delay(2000)
    val notes = (1..10).map {
        Note(
            "Title $it",
            "Description $it",
            if (it % 3 == 0) Type.AUDIO else Type.TEXT,
        )
    }
    emit(notes)
}