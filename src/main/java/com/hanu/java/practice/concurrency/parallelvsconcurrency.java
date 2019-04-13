package com.hanu.java.practice.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Hanumantharao Bitragunta
 */
public class parallelvsconcurrency {

    /*
    *
    * Concurrency vs Parallelism
    * */

    /*
    * PARALLELISM -> Parallelism is about doing a lot things at once, so that we can speed up our program
    *   To enable Parallelism in Java we can use any of below,
    *       .. Thread
    *       .. ThreadPool
    *           - ExecutorService  // find below example
    *           - ForkJoinPool
    *           - Custom ThreadPools(eg: Web Servers)
    *       .. Requires > 1 CPU
    * */

    /*
    * Concurrency ->
    * */

    public static void main(String[] args) {

        // Parallelism -- start
        // case - I
        // Here we are creating new threads
        new Thread(() -> {
            processTax(750000);
        }).start();
        new Thread(() -> {
                processTax(1000000);
        }).start();

        finalDeducts( 20, 150000,1000000);

        // case - II
        ExecutorService excService = Executors.newFixedThreadPool(4);
        excService.submit(() -> processTax(1000000));
        excService.submit(() -> processTax(1200000));
        // Parallelism -- end



    }

    private static void processTax(int amount){
        System.out.println("amout - "+amount);
        // caliculating tax
        Double actValue = (amount*12)%20.00;
        System.out.println("actValue - "+actValue);
    }

    private static void finalDeducts(float tax, float savings, int amount){
        // java 8 (Formatting Numeric Print Output)
        System.out.format("amout: - %d,\t savings: - %f,\t tax: %f", amount, savings, tax);

    }



}

/*
 *  # Thread.run() vs Runnable.start()
 *  _ Main difference is that when program calls start() method a new Thread is created
 *  _ inside run() method is executed in new Thread while if you call run() method directly no new Thread is created
 *       and code inside run() will execute on current Thread
 *  _
 *
 *
 * */