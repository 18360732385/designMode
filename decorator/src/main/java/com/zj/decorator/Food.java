/**
 * Copyright (C), 2019
 * FileName: Food
 * Author:   zhangjian
 * Date:     2019/10/29 15:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.decorator;

public class Food {
    private String food_name;

    public Food() {
    }

    public Food(String food_name) {
        System.out.println("主食是"+food_name);
        this.food_name = food_name;
    }

    public String make() {
        return food_name;
    }
}
