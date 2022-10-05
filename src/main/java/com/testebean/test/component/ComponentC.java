package com.testebean.test.component;

import org.springframework.stereotype.Component;

@Component("COMPONENT_C")
public class ComponentC implements ComponentInterface {
    @Override
    public void execute() {
        System.out.println(this.getClass().getSimpleName());
    }
}
