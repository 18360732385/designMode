/**
 * Copyright (C), 2019
 * FileName: Adapter
 * Author:   zhangjian
 * Date:     2019/10/29 16:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.adaptor;

/**
 * 类适配器，主要继承类（的方法）和实现接口（重写方法），达到适配功能
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("我是适配器Adapter重写接口Targetable的方法!");
    }
}