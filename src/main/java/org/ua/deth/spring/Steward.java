package org.ua.deth.spring;

import org.springframework.stereotype.Component;

@Component
public class Steward extends Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
