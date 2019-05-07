package com.audience.admin.demo;

public class Singleton {

    private static volatile Singleton singleton;

    private static volatile int i = 0;

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

    public static int getInt(){
        if (i==0){
            synchronized(Singleton.class){
                if (i==0){
                    i++;
                    System.out.println("进入了第二次判断"+i);
                }
            }
        }
        return i;
    }
}
