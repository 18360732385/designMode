/**
 * Copyright (C), 2019
 * FileName: StaticSingleton
 * Author:   zhangjian
 * Date:     2019/10/29 13:51
 * Description: 静态内部类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.singleton;

/**
 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。两者都是采用了类装载的机制来保证初始化实例时只有一个线程。不同的地方在饿汉式方式是只要Singleton类被装载就会实例化，没有Lazy-Loading的作用，而静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化。
 *
 * 	类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 *
 * 优点：避免了线程不安全，延迟加载，效率高。
 */
public class StaticSingleton {

    //构造器私有化
    private StaticSingleton(){}

    //私有的静态内部类，内部实例一个私有常量（static、final）
    private static class SingletonInstance{
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    //公开的静态方法，返回SingletonInstance实例的常量INSTANCE
    public static StaticSingleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
