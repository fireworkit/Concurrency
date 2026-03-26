package com.lc.concurrency.multithreading;

/**
 * @author lc
 * @date 2024/6/12
 */
public class ThreadTest1 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread, "Thread 1");
        Thread thread2 = new Thread(myThread, "Thread 2");
        Thread thread3 = new Thread(myThread, "Thread 3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
    }


class MyThread implements  Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+": is running");
    }

}
