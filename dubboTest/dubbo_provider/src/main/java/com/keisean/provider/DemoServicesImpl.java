package com.keisean.provider;

import com.keisean.api.DemoServices;

public class DemoServicesImpl implements DemoServices {
    public String sayHello(String name) {
        return "hello" + name;
    }
}
