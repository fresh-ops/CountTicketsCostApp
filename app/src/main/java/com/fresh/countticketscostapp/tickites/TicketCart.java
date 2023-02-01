package com.fresh.countticketscostapp.tickites;

import java.util.ArrayList;
import java.util.Objects;

public class TicketCart {
    private ArrayList<BusTicket> tickets = new ArrayList<BusTicket>();

    public void addTicket(BusTicket ticket) {
        tickets.add(ticket);
    }

    public float countCost() {
        float cost = 0;

        for (BusTicket tck : tickets) {
            cost += tck.getPrice();
        }

        return cost;
    }

    public TicketCart findByTicketType(String type) {
        TicketCart found = new TicketCart();

        for (BusTicket tck : tickets) {
            if (Objects.equals(tck.getTicketType(), type)) found.addTicket(tck);
        }

        return found;
    }
}
