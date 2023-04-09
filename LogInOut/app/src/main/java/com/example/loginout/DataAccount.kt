package com.example.loginout

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class DataAccount(
    var account :String,
    val password : String,
) :Parcelable

class ListAccount{
    companion object{
        var listAccount:MutableList<DataAccount> = mutableListOf()
    }
}