package org.ua.deth.spring.reflection;

/**
 * Created by DethGhost on 17.09.2016.
 */
public class FirstImpl implements IDao{
    @Override
    public void insert() {
        System.out.println("First");
    }
}
