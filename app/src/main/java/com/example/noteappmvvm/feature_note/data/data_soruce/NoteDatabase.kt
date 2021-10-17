package com.example.noteappmvvm.feature_note.data.data_soruce

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteappmvvm.feature_note.domain.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase :RoomDatabase(){
    abstract val noteDoa:NoteDao

    companion object{
        const val DATABASE_NAME="note_db"
    }
}