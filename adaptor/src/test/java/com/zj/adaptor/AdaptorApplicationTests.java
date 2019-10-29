package com.zj.adaptor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdaptorApplicationTests {

    @Test
    void AdapterTest1() {
        //多态
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }

    @Test
    void AdapterTest2() {

        Targetable target = new Wrapper(new Source());
        target.method1();
        target.method2();
    }
}
