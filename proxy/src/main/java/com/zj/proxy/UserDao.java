/**
 * Copyright (C), 2019
 * FileName: UserDao
 * Author:   zhangjian
 * Date:     2019/10/29 19:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.proxy;

import com.zj.proxy.inter.IUserDao;

//目标对象(必须要实现接口)
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("模拟：保存用户！");
    }

    @Override
    public void find() {
        System.out.println("模拟：查询用户");
    }
}
