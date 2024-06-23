package com.example.travelbookingapp.features.useraccount.builder

import com.example.travelbookingapp.features.useraccount.`interface`.UserBuilder
import com.example.travelbookingapp.features.useraccount.model.PersonModel

class PersonBuilder private constructor(
    val personModel: PersonModel
) {
    class Builder : UserBuilder {
        private var firstName: String = ""
        private var lastName: String = ""
        private var age: Int = 0
        private var type: String? = null
        override fun setFirstname(firstname: String) = apply {
            this.firstName = firstname
        }

        override fun setLastname(lastname: String) = apply {
            this.lastName = lastname
        }

        override fun setAge(age: Int) = apply {
            this.age = age
        }

        override fun type(type: String?) = apply {
            this.type = type
        }

        override fun build(): PersonBuilder = PersonBuilder(
            personModel = PersonModel(
                firstName = firstName,
                lastName = lastName,
                age = age,
                type = type
            )
        )
    }
}