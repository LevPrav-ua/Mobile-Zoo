package com.example.mobile_coding.model

abstract class Animal (
    var name: String,
    private val age: Int
) {
    abstract fun communicate(): String

    open fun getInfo() : String {
        return "$name, age: $age"
    }
}
