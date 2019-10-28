package com.zj.observer.observer;

import com.zj.observer.subject.Subject;

/**
 * Copyright (C), 2019
 * FileName: ObserverTwo
 * Author:   zhangjian
 * Date:     2019/7/11 18:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class ObserverTwo extends Observer{

    //初始化时将自己添加到subject的通知集合里
    public ObserverTwo(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(int i) {
        i += 2;
        System.out.println( "观察者2监听到对象 " +subject.toString()
                +",并将state变成："+ i );
    }
}
