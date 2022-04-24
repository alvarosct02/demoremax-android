package com.kamiz.demoremax.data.source

import com.kamiz.demoremax.data.models.Property

class PropertiesRepository {

    fun listProperties(): List<Property> {
//        TODO: Call API. Testing only
        return listOf(
            Property(
                id = "1",
                name = "Casita 1",
                description = "Lorem ipsum bla bla bla",
                years = 5,
                rooms = 3,
                bathrooms = 2,
                area = 91.7,
                price = 600500.0,
            ),
            Property(
                id = "2",
                name = "Casita 3",
                description = "Lorem ipsum Lorem ipsum",
                years = 1,
                rooms = 2,
                bathrooms = 1,
                area = 50.7,
                price = 400000.0,
            )
        )
    }
}