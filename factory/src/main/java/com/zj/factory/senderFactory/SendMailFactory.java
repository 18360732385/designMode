/**
 * Copyright (C), 2019
 * FileName: SendMailFactory
 * Author:   zhangjian
 * Date:     2019/10/29 19:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.factory.senderFactory;

import com.zj.factory.inter.Provider;
import com.zj.factory.inter.Sender;
import com.zj.factory.sender.MailSender;

public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
