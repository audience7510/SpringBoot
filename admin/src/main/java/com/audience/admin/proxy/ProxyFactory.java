package com.audience.admin.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    //维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){

        /**
         * 生成代理对象需要三个参数
         * 1 目标对象的类加载器
         * 2 目标对象实现的接口类型
         * 3 事件处理
         */
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        //前置处理
                        System.out.println("前置处理");

                        //执行目标对象的方法
                        Object invoke = method.invoke(proxy, args);

                        //后置处理
                        System.out.println("后置处理");
                        return invoke;
                    }
                }
        );
    }
}
