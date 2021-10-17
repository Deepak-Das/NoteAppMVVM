package com.example.noteappmvvm.feature_note.presentation.notes

import com.example.noteappmvvm.feature_note.domain.model.Note
import com.example.noteappmvvm.feature_note.domain.util.NoteOrder
import com.example.noteappmvvm.feature_note.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
) {

}