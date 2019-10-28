package com.zj.observer.subject;

import com.zj.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2019
 * FileName: Subject
 * Author:   zhangjian
 * Date:     2019/7/11 18:20
 * Description: 被观察者父类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class Subject {
    //保存注册的观察者对象
    private List<Observer> mObervers = new ArrayList<>();

    //注册观察者对象
    public void attach(Observer observer) {
        mObervers.add(observer);
    }

    //注销观察者对象
    public void detach(Observer observer) {
        mObervers.remove(observer);
    }

    //通知所有注册的观察者对象
    public void notifyEveryOne(int newState) {
        for (Observer observer : mObervers) {
            observer.update(newState);
        }
    }
}
