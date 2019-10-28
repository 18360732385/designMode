package com.zj.observer.observer;

import com.zj.observer.subject.Subject;

/**
 * Copyright (C), 2019
 * FileName: Observer
 * Author:   zhangjian
 * Date:     2019/7/11 18:23
 * Description: 观察者抽象类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public abstract class Observer {
    protected Subject subject;
    public abstract void update(int i);
}
