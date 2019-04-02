package org.dubbo1.Provider;

import org.dubbo1.Service.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
