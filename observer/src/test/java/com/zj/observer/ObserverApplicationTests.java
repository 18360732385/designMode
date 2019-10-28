package com.zj.observer;

import com.zj.observer.observer.ObserverOne;
import com.zj.observer.observer.ObserverTwo;
import com.zj.observer.subject.ConcreteSubject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObserverApplicationTests {

    @Test
    void contextLoads() {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        new ObserverOne(concreteSubject);
        new ObserverTwo(concreteSubject);

        System.out.println("被观察者ConcreteSubject改变state为5");
        concreteSubject.change(5);
        System.out.println("被观察者ConcreteSubject改变state为10");
        concreteSubject.change(10);
    }

}
