package com.example.mobile_coding.Model

abstract class Animal (
    var name: String,
    var age: Int,
    var customProp: String = "Default"
) {
    abstract fun communicate(): String

    open fun getInfo() : String {
        return "$name, age: $age"
    }
}
