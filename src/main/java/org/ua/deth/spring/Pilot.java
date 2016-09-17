package org.ua.deth.spring;

import org.springframework.stereotype.Component;

@Component
public class Pilot extends Employee{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
