/**
 * Copyright (C), 2019
 * FileName: UserDaoProxy
 * Author:   zhangjian
 * Date:     2019/10/29 19:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.proxy.proxy;

import com.zj.proxy.UserDao;
import com.zj.proxy.inter.IUserDao;

/**
 * 静态代理,代理对象(要实现与目标对象一样的接口)
 *
 * 静态代理虽然保证了业务类只需关注逻辑本身，代理对象的一个接口只服务于一种类型的对象。如果要代理的方法很多，势必要为每一种方法都进行代理。
 * 再者，如果增加一个方法，除了实现类需要实现这个方法外，所有的代理类也要实现此方法。增加了代码的维护成本。
 */
public class UserDaoProxy implements IUserDao {

    // 代理对象，需要维护一个目标对象
    private IUserDao target = new UserDao();

    @Override
    public void save() {
        System.out.println("代理操作： 开启事务...");
        target.save();   // 执行目标对象的方法
        System.out.println("代理操作：提交事务...");
    }

    @Override
    public void find() {
        target.find();
    }
}
