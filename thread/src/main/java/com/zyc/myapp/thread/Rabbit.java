package com.zyc.myapp.thread;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Rabbit implements Runnable {

    private SynResource synResource;

    public Rabbit(SynResource synResource) {
        this.synResource = synResource;
    }

    @Override
    public void run() {
        synResource.run();
    }
}
