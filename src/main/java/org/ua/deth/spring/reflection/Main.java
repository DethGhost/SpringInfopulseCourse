package org.ua.deth.spring.reflection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by DethGhost on 17.09.2016.
 */
public class Main {
    public static void main(String [] a) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, NoSuchMethodException, ClassNotFoundException {
        Factory factory = Factory.getOurInstance();
        MyService myService = factory.getBean("config.txt");
        myService.myMethod();


    }
}
