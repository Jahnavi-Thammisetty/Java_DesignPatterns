package com.ty;

public class SingleObject {

    public static SingleObject instance;

    private SingleObject(){}

    public static  SingleObject getInstance()
    {
        if(instance==null)
        {
            synchronized (SingleObject.class)
            {
                if(instance==null)
                {
                    instance=new SingleObject();

                }
            }
        }
        return instance;
    }
}
