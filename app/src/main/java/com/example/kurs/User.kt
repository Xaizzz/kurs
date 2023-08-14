package com.example.kurs

class User(var name: String, var age: Int, var id: Int) {
    fun addAge(years: Int) {
        age += years
    }
}