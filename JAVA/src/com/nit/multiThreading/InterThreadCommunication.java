package com.nit.multiThreading;

class WashRoom {
    private boolean isOccupied = false;
    // synchronized method to enter the washroom
    public synchronized void enter(String personName) {
        while (isOccupied) {
            System.out.println(personName + " waiting outside.....");
            try {
                wait(); // wait until the washroom becomes free
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isOccupied = true;
        System.out.println(personName + " entered the washroom...");
    }
    // synchronized method to leave the washroom
    public synchronized void leave(String personName) {
        isOccupied = false;
        System.out.println(personName + " left the washroom....");
        notify(); // notify one waiting thread
    }
}
class Person extends Thread {
    private WashRoom washRoom;
    private String name;

    public Person(WashRoom washRoom, String name) {
        this.washRoom = washRoom;
        this.name = name;
    }
    @Override
    public void run() {
        washRoom.enter(name);

        // Simulate time spent in the washroom
        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        washRoom.leave(name);
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        WashRoom washRoom = new WashRoom();

        Person person1 = new Person(washRoom, "Person 1");
        Person person2 = new Person(washRoom, "Person 2");

        person1.start();
        person2.start();
    }
}