package com.zyc.myapp.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/5/15.
 */
public class SynResource {



    /**
     * 产生死锁最简单的情况是，线程T1持有锁L1并申请锁L2,线程T2持有锁L2并申请锁L1;
     * 死锁的根本原因是：持有锁的同时申请另外的锁；获取锁的过程是阻塞的；
     * 避免锁的方法：避免在对象的同步方法中调用其他对象的同步方法。
     */
    public  synchronized void run(){
        System.out.println("thread group:"+Thread.currentThread().getThreadGroup());
        System.out.println("thread state:"+Thread.currentThread().getState());
        System.out.println("thread name:"+Thread.currentThread().getName());
    }

    /**
     * main方法本身是一个线程，是程序的主线程；
     * Thread类的start方法是启动线程使线程进入可运行状态
     * （并没有运行，当cpu空闲时才会运行）真正实现多线程的方法，
     * 而Thread类的run方法只是普通的方法，直接调用run方法并不会开辟新的线程，程序还是在主线程中运行；
     * 所以启动线程应该调用start方法，start方法会调用run方法执行并行逻辑。
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        SynResource synResource = new SynResource();
//        Tortoise tortoise = new Tortoise(synResource);
//        Rabbit rabbit = new Rabbit(synResource);
//        Thread thread = new Thread(rabbit);
//        tortoise.start();
//        thread.start();

        /**
         * 创建固定数目线程的线程池
         */
        Executor executor = Executors.newFixedThreadPool(4);
        executor.execute(new Judge(synResource));
        executor.execute(new Rabbit(synResource));
        executor.execute(new Tortoise(synResource));

        Executor executor1 = Executors.newSingleThreadExecutor();
        executor1.execute(new Judge(synResource));

        Executor executor2 = Executors.newSingleThreadScheduledExecutor();
        executor2.execute(new Judge(synResource));

        Executor executor3 = Executors.newCachedThreadPool();

    }
}
