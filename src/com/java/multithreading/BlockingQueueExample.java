package com.java.multithreading;

import java.util.concurrent.*;

public class BlockingQueueExample {

    public static void main(String[] args) throws InterruptedException {
        // Create a BlockingQueue with capacity of 10
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(10);

        // Create and start producer thread
        Thread producer = new Thread(new Producer(queue));
        producer.start();

        // Create and start consumer threads
        Thread consumer1 = new Thread(new Consumer(queue));
        Thread consumer2 = new Thread(new Consumer(queue));
        consumer1.start();
        consumer2.start();

        // Wait for the threads to finish
        producer.join();
        consumer1.join();
        consumer2.join();
    }
}

class Producer implements Runnable {
    private final BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                String message = "Message " + i;
                System.out.println("Produced: " + message);
                queue.put(message);  // Blocks if the queue is full
                Thread.sleep(500);  // Simulating work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = queue.take();  // Blocks if the queue is empty
                System.out.println("Consumed: " + message);
                Thread.sleep(1000);  // Simulating work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
