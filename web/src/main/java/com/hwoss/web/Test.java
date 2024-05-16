package com.hwoss.web;

import com.hwoss.suport.mq.SendMqService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@Slf4j
public class Test {
    private static final Logger LOG = Logger.getLogger(Test.class.getName());
    @Autowired
    private SendMqService sendMqService;


    @RequestMapping("/test")
    String test() {
//        int a = 1/0;
        sendMqService.send("hwoss_KEY", "111", "1");
        return "nihao ";

    }

}
