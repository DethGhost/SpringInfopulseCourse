package org.ua.deth.spring.reflection;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by DethGhost on 17.09.2016.
 */
public class Factory {
    private static Factory ourInstance = new Factory();

    public static Factory getOurInstance() {
        return ourInstance;
    }

    public MyService getBean(String fileName) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] lineArray = line.split(":");
        Class impl = Class.forName(lineArray[3]);
        Object obImpl = impl.newInstance();
        Class service = Class.forName(lineArray[1]);
        Class daoInt = Class.forName(lineArray[0]);
        Class[] paramClass = {daoInt};
        Constructor constructor = service.getConstructor(paramClass);
        Object[] param = {obImpl};
        Object serv = constructor.newInstance(param);

               return (MyService) serv;
    }


}
