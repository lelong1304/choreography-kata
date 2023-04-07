package org.example;

public class Inventory {
    private int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
    }

    boolean decrementCapacity(int numberOfSeats) {
        if (capacity < numberOfSeats ) {
            System.err.println("Incapacity booking error");
            return false;
        }
        capacity -= numberOfSeats;
        System.out.println("Capacity at " + capacity);
        return true;
    }
}
