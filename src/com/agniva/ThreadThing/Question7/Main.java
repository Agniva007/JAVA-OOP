package com.agniva.ThreadThing.Question7;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(3);
        MyThread thread3 = new MyThread(5);
        MyThread thread4 = new MyThread(7);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("Thread 1 count: " + thread1.getCount());
        System.out.println("Thread 2 count: " + thread2.getCount());
        System.out.println("Thread 3 count: " + thread3.getCount());
        System.out.println("Thread 4 count: " + thread4.getCount());
    }
}
