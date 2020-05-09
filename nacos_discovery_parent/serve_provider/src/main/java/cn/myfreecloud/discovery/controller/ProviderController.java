package cn.myfreecloud.discovery.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangyang
 * @date: 2020/5/8 16:38
 * @description:
 */
@RestController
public class ProviderController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProviderController.class);

    @GetMapping("/service")
    public String service(){

        LOGGER.info("provider invoke");
        return "provider invoke";
    }
}
