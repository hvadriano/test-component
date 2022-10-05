package com.testebean.test.controller;

import com.testebean.test.component.ComponentType;
import com.testebean.test.factory.ComponentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("component")
public class ComponentController {

    @Autowired
    private ComponentFactory componentFactory;

    @GetMapping()
    public String test() {

        componentFactory.make(ComponentType.COMPONENT_A.name());
        componentFactory.make(ComponentType.COMPONENT_B.name());
        componentFactory.make(ComponentType.COMPONENT_C.name());

        return "done";
    }
}
