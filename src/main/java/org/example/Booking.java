package org.example;

public class Booking {
    private final Inventory inventory;
    private final Ticketing ticketing;

    public Booking() {
        this.inventory = new Inventory(10);
        this.ticketing = new Ticketing();
    }

    public void book(int numberOfSeats) {
        boolean isDecrementCapacity = inventory.decrementCapacity(numberOfSeats);
        if (! isDecrementCapacity) {
            return;
        }
        ticketing.printTicket(numberOfSeats);
        System.out.println("booking requested");
    }
}
