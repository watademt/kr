package com.example.kr.booking

data class Booking(
    val id: String,
    val hotelName: String,
    val userName: String,
    val startDate: String,
    val endDate: String,
    val price: String,
    val roomType: String,
    val bedDetails: String,
    val hotelImageRes: Int,
    var status: String
)
