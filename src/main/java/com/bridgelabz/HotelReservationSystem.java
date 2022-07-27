package com.bridgelabz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class HotelReservationSystem {
    static List<Hotel> hotelList = new ArrayList<>();

    public static void main(String[] args) {
            System.out.println("Welcome to Hotel Reservation System");
            Hotel firstHotel=new Hotel("Lakewood", 450, 150, 3);
            Hotel secondHotel=new Hotel("Brigewood", 1000, 550, 4);
            Hotel thirdHotel=new Hotel("Ridgewood",540, 440, 5);
            hotelList.add(firstHotel);
            hotelList.add(secondHotel);
            hotelList.add(thirdHotel);
            hotelList.forEach(System.out::println);
            System.out.println("-----------------------------------");
            cheapestHotel("2020-09-11", "2020-09-12");
    }
    public static void cheapestHotel(String startDate, String endDate) {
        LocalDate startDateFormat = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Hotel cheapestHotel = hotelList.stream()
                .filter(n -> n.hotelRating > 3)
                .min(Comparator.comparing(Hotel::getTotalRates))
                .orElse(null);
        System.out.println("Cheapest Hotel is  :\n" + cheapestHotel);
        int totalRate = numberOfDays * cheapestHotel.totalRates;
        System.out.println("Stay in Hotel " + numberOfDays + " days and \nTotal rent Rate is :" + totalRate);

    }
}
