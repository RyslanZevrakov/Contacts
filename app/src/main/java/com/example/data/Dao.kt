package com.example.data
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(nameEntety: NameEntety)

    @Delete
    suspend fun deleteItem(nameEntety: NameEntety)

    @Query("SELECT * FROM name_table")
    fun getAllItems(): Flow<List<NameEntety>>
}