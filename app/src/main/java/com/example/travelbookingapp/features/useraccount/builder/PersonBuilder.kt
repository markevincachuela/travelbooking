package com.example.travelbookingapp.features.useraccount.builder

import com.example.travelbookingapp.features.useraccount.model.PersonModel

class PersonBuilder {

    private var firstName: String = ""
    private var lastName: String = ""
    private var age: Int = 0
    private var type: String? = null

    private fun createAccountBuilder(block: PersonBuilder.() -> Unit) =
        PersonBuilder().apply(block).build()

    private fun build(): PersonModel = PersonModel(
        firstName = firstName,
        lastName = lastName,
        age = age,
        type = type
    )

    // Setter functions (add these)
    private fun setFirstname(firstname: String) {
        this.firstName = firstname
    }
    private fun setLastname(lastName: String) {
        this.lastName = lastName
    }
    private fun setAge(age: Int) {
        this.age = age
    }
    private fun setType(type: String?) {
        this.type = type
    }

    fun createAccount(
        firstname: String,
        lastName: String,
        age: Int,
        type: String?
    ): PersonModel {
        return createAccountBuilder {
            setFirstname(firstname)
            setLastname(lastName)
            setAge(age)
            setType(type)
        }
    }
}