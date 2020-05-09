package cn.myfreecloud.discovery.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: zhangyang
 * @date: 2020/5/8 17:03
 * @description:
 */
@FeignClient(value = "serve-provider")
public interface ProviderClient {

    @GetMapping("/service")
    public String service();
}
