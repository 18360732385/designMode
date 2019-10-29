/**
 * Copyright (C), 2019
 * FileName: StaticSendFactory
 * Author:   zhangjian
 * Date:     2019/10/29 18:34
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
 * 3.静态工厂模式
 */
public class StaticSendFactory {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
