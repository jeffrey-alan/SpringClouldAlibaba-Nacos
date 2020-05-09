package cn.myfreecloud.controller;

import cn.myfreecloud.api.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangyang
 * @date: 2020/5/8 23:36
 * @description:
 */
@RestController
public class ApplicationController {

    //注入service 基于dubbo协议
    @org.apache.dubbo.config.annotation.Reference
    ConsumerService consumerService;

    @GetMapping("/service")
    public String service() {
        String service = consumerService.service();

        return "test" + service;
    }
}
