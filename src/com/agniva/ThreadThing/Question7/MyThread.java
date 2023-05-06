package com.agniva.ThreadThing.Question7;

public class MyThread extends Thread {
    private int count = 0;
    private long startTime;

    public MyThread(int priority) {
        setPriority(priority);
        startTime = System.currentTimeMillis();
    }

    public void run() {
        while (System.currentTimeMillis() - startTime < 10) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

