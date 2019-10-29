/**
 * Copyright (C), 2019
 * FileName: SendSmsFactory
 * Author:   zhangjian
 * Date:     2019/10/29 19:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.factory.senderFactory;

import com.zj.factory.inter.Provider;
import com.zj.factory.inter.Sender;
import com.zj.factory.sender.SmsSender;

public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
