package com.example.mobile_coding.models

class Parrot
constructor(
    name: String,
    age: Int
) : Animal(name, age), Flyable {
    override fun fly() {
        // TODO fly implementation
    }

    override fun getInfo(): String {
        return "I'm Parrot. There is info about me: ${super.getInfo()}"
    }

    override fun communicate(): String {
        return "I AM A PARRROT!"
    }
}