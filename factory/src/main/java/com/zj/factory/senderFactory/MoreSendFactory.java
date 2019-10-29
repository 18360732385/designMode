/**
 * Copyright (C), 2019
 * FileName: MoreSendFactory
 * Author:   zhangjian
 * Date:     2019/10/29 18:31
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
 * 2.多个工厂模式
 */
public class MoreSendFactory {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
