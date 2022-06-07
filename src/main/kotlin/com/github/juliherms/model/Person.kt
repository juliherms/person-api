package com.github.juliherms.model

/**
 * This class responsible to represents a person
 */
data class Person (

    var id: Long = 0,
    var firstName: String = "",
    var lastName: String = "",
    var address: String = "",
    var gender: String = ""
)