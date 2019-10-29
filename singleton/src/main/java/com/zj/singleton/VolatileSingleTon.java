/**
 * Copyright (C), 2019
 * FileName: VolatileSingleTon
 * Author:   zhangjian
 * Date:     2019/10/29 14:01
 * Description: 双重检查单例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.singleton;

/**
 * Double-Check概念对于多线程开发者来说不会陌生，如代码中所示，我们进行了两次if (singleton == null)检查，这样就可以保证线程安全了。这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象。
 *
 * 优点：线程安全；延迟加载；效率较高。
 */
public class VolatileSingleTon {
    //使用 Volatile 保证了指令重排序在这个对象创建的时候不可用
    private volatile static  VolatileSingleTon singleTon = null;

    //构造器私有化
    private VolatileSingleTon() {}

    //双重检查
    public static VolatileSingleTon getInstance() {
        if (singleTon == null) {
            synchronized (VolatileSingleTon.class) {
                if (singleTon == null) {
                    singleTon = new VolatileSingleTon();
                }
            }
        }
        return singleTon;
    }
}
