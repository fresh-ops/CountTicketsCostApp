package com.fresh.countticketscostapp.tickites;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Класс корзины билетов
 */
public class TicketCart {
    /** Поле списка билетов */
    private ArrayList<BusTicket> tickets = new ArrayList<BusTicket>();

    /**
     * Метод добавления билета в корзину
     * @param ticket сущность билета для добавления
     */
    public void addTicket(BusTicket ticket) {
        tickets.add(ticket);
    }

    /**
     * Метод подсчёта общей стоимости билетов в корзине
     * @return стоимость билетов
     */
    public float countCost() {
        float cost = 0;

        for (BusTicket tck : tickets) {
            cost += tck.getPrice();
        }

        return cost;
    }

    /**
     * Метод поиска билетов в корзине
     * @param type тип билета
     * @return экземпляр TicketCart, содержащий билеты указанного типа
     */
    public TicketCart findByTicketType(String type) {
        TicketCart found = new TicketCart();

        for (BusTicket tck : tickets) {
            if (Objects.equals(tck.getTicketType(), type)) found.addTicket(tck);
        }

        return found;
    }
}
