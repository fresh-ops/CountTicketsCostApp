package com.fresh.countticketscostapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.fresh.countticketscostapp.tickites.BusTicket;
import com.fresh.countticketscostapp.tickites.BusTicketChild;
import com.fresh.countticketscostapp.tickites.BusTicketPensioner;
import com.fresh.countticketscostapp.tickites.TicketCart;

public class MainActivity extends AppCompatActivity {
    TicketCart cart = new TicketCart();

    private void fillCart() {
        // добавляем взрослые билеты
        for (int i = 0; i < 9; i++) {
            BusTicket ticket = new BusTicket("Горно-Алтайск", "Артыбаш", "1 июня 7:00", "4 часа 30 минут",
                    157, 70);
            cart.addTicket(ticket);
        }
        // добавляем детские билеты
        for (int i = 0; i < 11; i++) {
            BusTicket ticket = new BusTicketChild("Горно-Алтайск", "Артыбаш", "1 июня 7:00", "4 часа 30 минут",
                    157, 70);
            cart.addTicket(ticket);
        }
        // добавляем пенсионерские билеты
        for (int i = 0; i < 5; i++) {
            BusTicket ticket = new BusTicketPensioner("Горно-Алтайск", "Артыбаш", "1 июня 7:00", "4 часа 30 минут",
                    157, 70);
            cart.addTicket(ticket);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillCart();
        TextView ticketsCostOut = findViewById(R.id.ticketsCostOut);
        ticketsCostOut.setText(cart.countCost() + " монет");
    }
}