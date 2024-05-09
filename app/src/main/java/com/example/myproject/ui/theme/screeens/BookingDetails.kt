package com.example.myproject.ui.theme.screeens

//import androidx.room.PrimaryKey

@Entity
annotation class Entity
data class BookingDetails(
    @PrimaryKey val registrationNumber: String,
    val roomtype : String,
    val gender : String,
    val name : String,
    val email : String,
    val room : String,
    val seater : String,
    val hostel : String,
    val bed : String,
) {
    annotation class PrimaryKey
}

