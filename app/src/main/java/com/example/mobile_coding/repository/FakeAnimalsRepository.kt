package com.example.mobile_coding.repository

import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Cat
import com.example.mobile_coding.model.Dog
import com.example.mobile_coding.model.Parrot

class FakeAnimalsRepository : AnimalsRepository {
    override fun getAnimals(): List<Animal> {
        return ArrayList<Animal>().apply {
            add(Cat("Pushok1", 9))
            add(Parrot("Krasava3", 5))
            add(Dog("Sharik4", 13))
            add(Cat("Pushok2", 3))
            add(Parrot("Krasava2", 8))
            add(Dog("Sharik1", 7))
            add(Cat("Pushok3", 5))
            add(Parrot("Krasava1", 3))
            add(Dog("Sharik2", 4))
            add(Cat("Pushok1", 9))
            add(Parrot("Krasava3", 5))
            add(Dog("Sharik4", 13))
            add(Cat("Pushok2", 3))
            add(Parrot("Krasava2", 8))
            add(Dog("Sharik1", 7))
            add(Cat("Pushok3", 5))
            add(Parrot("Krasava1", 3))
            add(Dog("Sharik2", 4))
            add(Cat("Pushok1", 9))
            add(Parrot("Krasava3", 5))
            add(Dog("Sharik4", 13))
            add(Cat("Pushok2", 3))
            add(Parrot("Krasava2", 8))
            add(Dog("Sharik1", 7))
            add(Cat("Pushok3", 5))
            add(Parrot("Krasava1", 3))
            add(Dog("Sharik2", 4))
        }
    }
}