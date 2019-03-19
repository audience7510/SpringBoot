package com.audience.admin.proxy;

public class TestProxy {
    public static void main(String[] args){

        IUserDao target = new UserDao();

        //给目标对象创建代理对象
        IUserDao proxy = (IUserDao)new ProxyFactory(target).getProxyInstance();

        //代理对象执行方法
        proxy.save();

        String s1 = "ab";
        String s2 = "cd";
        String s3 = "ab" + "cd";//常量池中的对象
        String s4 = s1 + s2;//堆中创建对象,相当于String s4 = new String("abcd");
        String s5 = "abcd"; //常量池中的对象
        System.out.println(s3==s4);//false s3指向常量池中的对象,s4指向堆中的对象
        System.out.println(s3==s5);//true 都指向常量池中的对象
        System.out.println(s4==s5);//false

        Integer i1 = 40;
        Integer i2 = 40;
        Integer i3 = 0;
        Integer i4 = new Integer(40);
        Integer i5 = new Integer(40);
        Integer i6 = new Integer(0);
        System.out.println(i1==i2);//true 常量池
        System.out.println(i1==i2+i3);//true 常量池
        System.out.println(i1==i4);//false i1常量池,i4堆
        System.out.println(i4==i5);//false 两个堆对象
        System.out.println(i4==i5+i6);//true 有运算符 + ,自动拆箱 进行数值比较
        System.out.println(40==i5+i6);//true 有运算符 + ,自动拆箱 进行数值比较


    }


}
