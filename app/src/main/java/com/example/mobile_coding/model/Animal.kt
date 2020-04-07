package com.example.mobile_coding.model

abstract class Animal (
    var name: String,
    var age: Int
) {
    abstract fun communicate(): String

    open fun getInfo() : String {
        return "$name, age: $age"
    }

}
