package com.example.tp2_recyclerviewdap.Fragments

import androidx.lifecycle.ViewModel
import com.example.tp2_recyclerviewdap.User

class LoginScreenViewModel : ViewModel() {
    var usersList: MutableList<User> = mutableListOf()
}