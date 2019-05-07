package com.audience.admin.demo;

public class ThreadDemo implements Runnable {

    @Override
    public void run() {
        try {
            int anInt = Singleton.getInt();
            System.out.println(anInt);
        }catch (Exception e){

        }
    }
}
