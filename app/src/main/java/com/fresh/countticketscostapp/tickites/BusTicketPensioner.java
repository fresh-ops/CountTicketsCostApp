package com.fresh.countticketscostapp.tickites;

public class BusTicketPensioner extends BusTicket {
    private final float DISCOUNT = 30;

    public BusTicketPensioner() {
    }

    public BusTicketPensioner(String departurePoint, String arrivalPoint, String departureDate, String travelTime, float distance, float price) {
        super(departurePoint, arrivalPoint, departureDate, travelTime, distance, price);
    }

    @Override
    public float getPrice() {
        return price * (100 - DISCOUNT) / 100;
    }

    @Override
    public String getTicketType() {
        return "Pensioner";
    }
}
