package com.bridgelabz;

import java.util.ArrayList;


public class HotelReservationSystem {

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");
        ArrayList<Hotel> hotelArrayList=new ArrayList<>();
        Hotel hotel=new Hotel("LakeWood",450.00);
        Hotel hotel1=new Hotel("SITARA",1000.00);
        Hotel hotel2=new Hotel("TAJ",540.00);
        hotelArrayList.add(hotel);
        hotelArrayList.add(hotel1);
        hotelArrayList.add(hotel2);
        System.out.println(hotelArrayList);
    }
}
