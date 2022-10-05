package com.testebean.test.factory;

import com.testebean.test.component.ComponentInterface;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentFactory {

    @Autowired
    private BeanFactory beanFactory;

    public void make(String componentName) {
        ComponentInterface component = beanFactory.getBean(componentName, ComponentInterface.class);
        component.execute();
    }
}
