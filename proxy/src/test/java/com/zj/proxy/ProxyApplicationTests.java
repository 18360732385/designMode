package com.zj.proxy;

import com.zj.proxy.inter.IUserDao;
import com.zj.proxy.proxy.CGLibProxy;
import com.zj.proxy.proxy.JDKProxy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProxyApplicationTests {

    /**
     * JDK动态代理测试
     */
    @Test
    void testJDKProxy() {
        //创建代理目标
        IUserDao target = new UserDao();
        System.out.println("目标对象："+target.getClass());

        //代理类
        IUserDao proxy = (IUserDao) new JDKProxy(target).getProxyInstance();
        System.out.println("代理类："+proxy.getClass());

        //代理执行目标对象方法
        proxy.find();
        proxy.save();
    }

    /**
     * CGLib动态代理测试
     */
    @Test
    void testCGLibProxy() {
        //代理目标
        IUserDao target = new UserDao();
        System.out.println("目标对象："+target.getClass());

        //代理类
        IUserDao proxy = (IUserDao) new CGLibProxy(target).getProxyInstance();
        System.out.println("代理类："+proxy.getClass());

        //执行代理对象的方法
        proxy.find();
        proxy.save();
    }

}
