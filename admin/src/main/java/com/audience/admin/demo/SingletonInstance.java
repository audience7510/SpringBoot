package com.audience.admin.demo;

public class SingletonInstance {

    //私有构造
    private SingletonInstance(){}

    public static SingletonInstance getSingletonInstance(){

        //调用静态内部类的静态属性
        return SingletonInner.singletonInstance;
    }

    //静态内部类
    private static class SingletonInner{

        //静态成员变量
        static SingletonInstance singletonInstance = new SingletonInstance();
    }
}