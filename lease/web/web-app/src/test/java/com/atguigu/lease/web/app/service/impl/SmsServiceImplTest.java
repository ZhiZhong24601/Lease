package com.atguigu.lease.web.app.service.impl;

import com.atguigu.lease.web.app.service.SmsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmsServiceImplTest {

    @Autowired
    private SmsService smsService;

    @Test
    void sendCode() {
        smsService.sendCode("18935122287","1234");
    }
}