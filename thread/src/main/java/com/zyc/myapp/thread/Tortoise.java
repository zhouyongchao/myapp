package com.zyc.myapp.thread;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Tortoise extends Thread {

    private SynResource synResource;

    public Tortoise(SynResource synResource) {
        this.synResource = synResource;
    }

    @Override
    public void run() {

        synResource.run();
        super.run();
    }



}
