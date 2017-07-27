package com.zyc.myapp.thread;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Judge implements Runnable{

    private SynResource synResource;

    public Judge(SynResource synResource) {
        this.synResource = synResource;
    }

    @Override
    public void run() {
        synResource.run();
    }


}
