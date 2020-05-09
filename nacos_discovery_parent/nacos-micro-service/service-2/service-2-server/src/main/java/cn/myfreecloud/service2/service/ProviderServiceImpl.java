package cn.myfreecloud.service2.service;

import cn.myfreecloud.api.ProviderService;

@org.apache.dubbo.config.annotation.Service
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String service() {
        return "provider2 invoke";
    }
}
