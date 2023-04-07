package org.example;

public class Main {
    public static void main(String[] args) {
        Booking booking = new Booking();
        Inventory inventory = new Inventory(10);
        Ticketing ticketing = new Ticketing();
        Orchestrator orchestrator = new Orchestrator(booking, inventory, ticketing);
        orchestrator.run(3);
        orchestrator.run(9);
    }
}