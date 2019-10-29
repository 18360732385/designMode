/**
 * Copyright (C), 2019
 * FileName: SendFaceFactory
 * Author:   zhangjian
 * Date:     2019/10/29 19:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.factory.senderFactory;

import com.zj.factory.inter.Provider;
import com.zj.factory.inter.Sender;
import com.zj.factory.sender.FaceSender;

public class SendFaceFactory implements Provider {
    @Override
    public Sender produce() {
        return new FaceSender();
    }
}
