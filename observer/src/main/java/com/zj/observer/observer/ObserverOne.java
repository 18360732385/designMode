package com.zj.observer.observer;

import com.zj.observer.subject.Subject;

/**
 * Copyright (C), 2019
 * FileName: ObserverOne
 * Author:   zhangjian
 * Date:     2019/7/11 18:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class ObserverOne extends Observer{

    //初始化时将自己添加到subject的通知集合里
    public ObserverOne(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(int i) {
        i += 1;
        System.out.println( "观察者1监听到对象 " +subject.toString()
                +",并将state变成："+ i );
    }
}
