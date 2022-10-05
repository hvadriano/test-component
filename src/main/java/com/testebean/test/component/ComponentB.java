package com.testebean.test.component;

import org.springframework.stereotype.Component;

@Component("COMPONENT_B")
public class ComponentB implements ComponentInterface {
    @Override
    public void execute() {
        System.out.println(this.getClass().getSimpleName());
    }
}
