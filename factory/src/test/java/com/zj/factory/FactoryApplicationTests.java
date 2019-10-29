package com.zj.factory;

import com.zj.factory.inter.Provider;
import com.zj.factory.inter.Sender;
import com.zj.factory.senderFactory.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FactoryApplicationTests {

    /**
     * 1.简单的工厂模式
     */
    @Test
    void factory1() {
        SendFactory sendFactory = new SendFactory();
        Sender smsSender = sendFactory.produce("sms");
        smsSender.Send();
    }

    /**
     * 2.多个工厂模式
     */
    @Test
    void factory2() {
        MoreSendFactory factory = new MoreSendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }

    /**
     * 3.多个工厂模式
     */
    @Test
    void factory3() {
        Sender sender = StaticSendFactory.produceMail();
        sender.Send();
    }

    /**
     * 4.抽象工厂模式
     * 创建多个工厂类(实现接口)，如果有新的需求，直接增加新的工厂类和对应产品即可，而不是去修改工厂类
     */
    @Test
    void factory4() {
        Provider provider = new SendFaceFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
