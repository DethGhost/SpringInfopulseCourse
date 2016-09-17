package org.ua.deth.spring.reflection;

/**
 * Created by DethGhost on 17.09.2016.
 */
public class SecondImpl implements IDao{
    @Override
    public void insert() {
        System.out.println("Second");
    }
}
