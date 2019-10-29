/**
 * Copyright (C), 2019
 * FileName: FaceSender
 * Author:   zhangjian
 * Date:     2019/10/29 19:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.factory.sender;

import com.zj.factory.inter.Sender;

public class FaceSender implements Sender {
    @Override
    public void Send() {
        System.out.println("这是面对面发送发送");
    }
}
