package org.example;

public class Orchestrator {
    private final Booking booking;
    private final Inventory inventory;
    private final Ticketing ticketing;

    public Orchestrator(Booking booking, Inventory inventory, Ticketing ticketing) {
        this.booking = booking;
        this.inventory = inventory;
        this.ticketing = ticketing;
    }

    public void run(int numberOfSeats) {
        booking.book(numberOfSeats);
        boolean isDecrementCapacity = inventory.decrementCapacity(numberOfSeats);
        if (!isDecrementCapacity) {
            return;
        }
        ticketing.printTicket(numberOfSeats);
    }
}
