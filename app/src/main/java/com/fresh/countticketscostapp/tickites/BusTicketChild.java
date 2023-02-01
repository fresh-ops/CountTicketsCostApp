package com.fresh.countticketscostapp.tickites;

public class BusTicketChild extends BusTicket {
    private final float DISCOUNT = 50;

    public BusTicketChild() {
    }

    public BusTicketChild(String departurePoint, String arrivalPoint, String departureDate, String travelTime, float distance, float price) {
        super(departurePoint, arrivalPoint, departureDate, travelTime, distance, price);
    }

    @Override
    public float getPrice() {
        return price * (100 - DISCOUNT) / 100;
    }

    @Override
    public String getTicketType() {
        return "Child";
    }
}
