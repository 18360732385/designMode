/**
 * Copyright (C), 2019
 * FileName: SmsSender
 * Author:   zhangjian
 * Date:     2019/10/29 18:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.factory.sender;

import com.zj.factory.inter.Sender;

public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("这是短信发送方式");
    }
}
