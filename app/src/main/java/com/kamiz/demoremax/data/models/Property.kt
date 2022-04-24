package com.kamiz.demoremax.data.models

data class Property(
    val id: String,
    val name: String,
    val description: String,
    val years: Int,
    val rooms: Int,
    val bathrooms: Int,
    val area: Double,
    val price: Double,
)