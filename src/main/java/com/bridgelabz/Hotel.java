package com.bridgelabz;

public class Hotel {
        String hotelName;
        double hotelRate;

        public Hotel(String hotelName, double hotelRate) {
            this.hotelName = hotelName;
            this.hotelRate = hotelRate;
        }

        @Override
        public String toString() {
            return "Hotel{" +
                    "hotelName='" + hotelName + '\'' +
                    ", hotelRate=" + hotelRate +
                    '}';
        }
}
