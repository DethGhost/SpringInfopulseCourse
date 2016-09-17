package org.ua.deth.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.ua.deth.spring.AirCompany;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
        AirCompany company = context.getBean("airCompany", AirCompany.class);
        System.out.println(company.calculate());
    }
}
