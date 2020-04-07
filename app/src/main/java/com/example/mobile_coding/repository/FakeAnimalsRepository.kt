package com.example.mobile_coding.repository

import com.example.mobile_coding.model.Animal

class FakeAnimalsRepository : AnimalsRepository {
    override fun getAnimals(): List<Animal> {
        val fakeAnimals = ArrayList<Animal>()
        return fakeAnimals.apply {
        }
    }
}