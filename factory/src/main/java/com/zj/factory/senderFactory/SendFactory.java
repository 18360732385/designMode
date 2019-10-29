/**
 * Copyright (C), 2019
 * FileName: SendFactory
 * Author:   zhangjian
 * Date:     2019/10/29 18:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.factory.senderFactory;

import com.zj.factory.inter.Sender;
import com.zj.factory.sender.MailSender;
import com.zj.factory.sender.SmsSender;

/**
 * 1.简单的工厂模式
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
