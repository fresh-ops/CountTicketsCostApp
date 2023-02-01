package com.fresh.countticketscostapp.tickites;

/**
 * Базовый класс билета
 */
public class BusTicket {
    private String departurePoint;
    private String arrivalPoint;
    private String departureDate;
    private String travelTime;
    private float distance;
    protected float price;

    public BusTicket() {
    }

    /**
     * Конструктор BusTicket
     * @param departurePoint место отправления
     * @param arrivalPoint место прибытия
     * @param departureDate дата отправления
     * @param travelTime время пути
     * @param distance расстояния
     * @param price цена билета
     */
    public BusTicket(String departurePoint, String arrivalPoint, String departureDate, String travelTime, float distance, float price) {
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.departureDate = departureDate;
        this.travelTime = travelTime;
        this.distance = distance;
        this.price = price;
    }

    /**
     * Метод получение цены билета
     * @return возвращает цену билета
     */
    public float getPrice() {
        return price;
    }

    /**
     * Метод получения типа билета
     * базовый тип - Adult (взрослый)
     * @return возвращает тип билета
     */
    public String getTicketType() {
        return "Adult";
    }
}
