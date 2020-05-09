package cn.myfreecloud.service1.service;

import cn.myfreecloud.api.ConsumerService;
import cn.myfreecloud.api.ProviderService;

// 注解表示
// 此类的方法将来要暴露为Dubbo接口
@org.apache.dubbo.config.annotation.Service
public class ConsumerServiceImpl implements ConsumerService {

    @org.apache.dubbo.config.annotation.Reference
    ProviderService providerService;

    // Dubbo接口的内容
    @Override
    public String service() {
        // service1 调用 service2
        String service = providerService.service();
        return "Consumer1 invoke" + service;
    }
}
