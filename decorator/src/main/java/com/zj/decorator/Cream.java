/**
 * Copyright (C), 2019
 * FileName: Cream
 * Author:   zhangjian
 * Date:     2019/10/29 16:00
 * Description: 奶油
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.decorator;

//奶油类
public class Cream extends Food {

    private Food basic_food;

    public Cream(Food basic_food) {
        System.out.println("铺一层奶油");
        this.basic_food = basic_food;
    }

    public String make() {
        return basic_food.make()+"+奶油";
    }
}
