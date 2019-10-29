package com.zj.singleton;

/**
 * 枚举的思想其实是通过共有的静态 final 与为每个枚举常量导出实例的类，由于没有可访问的构造器，所以不能调用枚举常量的构造方法去生成对应的对象。
 * 因此在《Effective Java》 中，枚举类型为类型安全的枚举模式，枚举也被称为单例的泛型化。
 * 它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象，可谓是很坚强的壁垒
 */
public enum Singleton {
    //线程安全的实例
    INSTANCE;

    //方法
    public void whateverMethod() {

    }
}
