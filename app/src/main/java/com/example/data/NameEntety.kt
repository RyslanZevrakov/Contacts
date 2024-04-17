package com.example.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "name_table")
data class NameEntety (
    @PrimaryKey(autoGenerate = true )
    var id: Int? = null,
    val name : String

)