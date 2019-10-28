package com.zj.observer;

import com.zj.observer.observer.ObserverOne;
import com.zj.observer.observer.ObserverTwo;
import com.zj.observer.subject.ConcreteSubject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        new ObserverOne(concreteSubject);
        new ObserverTwo(concreteSubject);

        System.out.println("被观察者ConcreteSubject改变state为5");
        concreteSubject.change(5);
        System.out.println("被观察者ConcreteSubject改变state为10");
        concreteSubject.change(10);
    }

}
