package com.zj.observer.subject;

/**
 * Copyright (C), 2019
 * FileName: ConcreteSubject
 * Author:   zhangjian
 * Date:     2019/7/11 18:22
 * Description: 被观察者（主要用到父类的notifyEveryOne方法，去通知观察者）
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class ConcreteSubject extends Subject {
    private int state;

    public int getState() {
        return state;
    }

    //一旦ConcreteSubject执行change方法，就通知所有观察者
    public void change(int newState) {
        state = newState;

        //状态发生改变，通知观察者
        notifyEveryOne(newState);
    }
}
