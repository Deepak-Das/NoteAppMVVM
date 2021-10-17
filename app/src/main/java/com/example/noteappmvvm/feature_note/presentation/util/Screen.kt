package com.example.noteappmvvm.feature_note.presentation.util

sealed class Screen(val route:String){
    object NotesScree:Screen("notes_screen")
    object AddEditNoteScreen : Screen("add_edit_note_screen")
}
