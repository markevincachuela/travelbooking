package com.example.travelbookingapp.features.useraccount.`interface`

import com.example.travelbookingapp.features.useraccount.builder.PersonBuilder

interface UserBuilder{
    fun setFirstname(firstname:String) : UserBuilder
    fun setLastname(lastname:String): UserBuilder
    fun setAge(age:Int): UserBuilder
    fun type(type:String?): UserBuilder
    fun build(): PersonBuilder

}