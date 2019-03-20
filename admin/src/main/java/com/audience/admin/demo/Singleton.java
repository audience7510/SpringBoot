package com.audience.admin.demo;

public class Singleton {

    private static volatile Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton==null){
            //同步代码块
            synchronized (Singleton.class){
                if (singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
