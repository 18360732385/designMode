/**
 * Copyright (C), 2019
 * FileName: Bread
 * Author:   zhangjian
 * Date:     2019/10/29 15:56
 * Description: 面包类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.decorator;

//面包类
public class Bread extends Food {

    private Food basic_food;

    public Bread(Food basic_food) {
        System.out.println("加上下两片面包");
        this.basic_food = basic_food;
    }

    public String make() {
        return "面包+"+basic_food.make()+"+面包";
    }
}
