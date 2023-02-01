package com.fresh.countticketscostapp.tickites;

/**
 * Класс BusTicketChild. Наследуется от BusTicket
 */
public class BusTicketPensioner extends BusTicket {
    /** Поле скидки */
    private final float DISCOUNT = 30;

    public BusTicketPensioner() {
    }

    /**
     * Конструктор BusTicketChild
     *
     * Идентичен коструктору родителя
     * @see BusTicket#BusTicket(String, String, String, String, float, float)
     */
    public BusTicketPensioner(String departurePoint, String arrivalPoint, String departureDate, String travelTime, float distance, float price) {
        super(departurePoint, arrivalPoint, departureDate, travelTime, distance, price);
    }

    @Override
    /**
     * Метод получения цены билета
     * Цена рассчитывается с учётом скиндки
     * @see BusTicketChild#DISCOUNT
     *
     * @see BusTicket#getPrice()
     * @return возвращает цену билета
     */
    public float getPrice() {
        return price * (100 - DISCOUNT) / 100;
    }

    @Override
    /**
     * Метод получения типа билета
     * @see BusTicket#getTicketType()
     */
    public String getTicketType() {
        return "Pensioner";
    }
}
