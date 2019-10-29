/**
 * Copyright (C), 2019
 * FileName: CGLibProxy
 * Author:   zhangjian
 * Date:     2019/10/29 19:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.proxy.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 使用 JDK 生成的动态代理的前提是目标类必须有实现的接口。但这里又引入一个问题，如果某个类没有实现接口，就不能使用 JDK 动态代理。所以 CGLIB 代理就是解决这个问题的。
 *
 * 	CGLIB 是以动态生成的子类继承目标的方式实现，在运行期动态的在内存中构建一个子类，如下：
 *
 * 	CGLIB 使用的前提是目标类不能为 final 修饰。因为 final 修饰的类不能被继承。
 */
public class CGLibProxy implements MethodInterceptor {
    private Object target;

    public CGLibProxy(Object target) {
        this.target = target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance() {
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object returnValue =null;
        if ("find".equals(method.getName())) {
            System.out.println("start writing...");
            //执行目标对象的方法
            returnValue = method.invoke(target, objects);
            System.out.println("end writing...");
        }else{
            returnValue = method.invoke(target, objects);
        }
        return returnValue;
    }
}
