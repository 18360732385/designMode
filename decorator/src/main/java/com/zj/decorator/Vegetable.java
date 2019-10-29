/**
 * Copyright (C), 2019
 * FileName: Vegetable
 * Author:   zhangjian
 * Date:     2019/10/29 16:01
 * Description: 蔬菜
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.decorator;

//蔬菜类
public class Vegetable extends Food {

    private Food basic_food;

    public Vegetable(Food basic_food) {
        System.out.println("添一些蔬菜");
        this.basic_food = basic_food;
    }

    public String make() {
        return basic_food.make() + "+蔬菜";
    }
}
