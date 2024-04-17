package com.example.contacts

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.data.NameEntety


import com.example.data.MainDb
import kotlinx.coroutines.launch

class MainViewModel(val database: MainDb) : ViewModel() {
    val itemsList = database.dao.getAllItems()
    val newText = mutableStateOf("")
    var nameEntety: NameEntety? = null

    fun insertItem() = viewModelScope.launch {
        val nameItem = nameEntety?.copy(name = newText.value)
            ?: NameEntety(name = newText.value)
        database.dao.insertItem(nameItem)
        nameEntety = null
        newText.value = ""
    }

    fun deleteItem(item : NameEntety) = viewModelScope.launch {
        database.dao.deleteItem(item)
    }

    companion object {
        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras
            ): T {
                val database = (checkNotNull(extras[APPLICATION_KEY]) as App).database
                return MainViewModel(database) as T
            }
        }
    }
}