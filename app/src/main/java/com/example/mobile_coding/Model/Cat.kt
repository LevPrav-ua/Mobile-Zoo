package com.example.mobile_coding.Model

class Cat(name: String, age: Int) : Animal(name, age, "Cat Prop"
) {
    override fun communicate(): String {
        return "MEOW"
    }

    override fun getInfo(): String {
        return "${communicate()} I'm a cat ${super.getInfo()}"
    }
}