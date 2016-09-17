package org.ua.deth.spring.reflection;

/**
 * Created by DethGhost on 17.09.2016.
 */
public class MyService {

    private IDao dao;

    public MyService(IDao dao) {
        this.dao = dao;
    }
    public void myMethod(){
        dao.insert();
        System.out.println("ggg");
    }
}
