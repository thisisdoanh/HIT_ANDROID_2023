package com.example.test

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(true)
    val id: Int = 0,

    val name_abc: String? = null,
    @ColumnInfo("avatar")
    val avatar: String? = null
)
