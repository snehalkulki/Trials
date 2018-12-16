package com.oppo.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author snehal_kulkarni
 *
 */

/*
 * 4 ways of breaking a singleton class
 * 1) Cloning
 * 2) Reflection
 * 3) Serialization / Deserialization
 * 4) Threading
 * 
 */
public class SingletonTrial implements Cloneable, Serializable {

    public static SingletonTrial instance = null; //Lazy Initialization 

    public SingletonTrial() {
        if(null!=instance){
            throw new RuntimeException("Cant create multiple Instances of Singleton Class using reflection!!");
        }
        System.out.println("Creating");
    }

    public static SingletonTrial getInstance() {
        if(instance == null){
            instance = new SingletonTrial();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        if(null != instance){
            return instance;
        }
        return super.clone();
    }

    
    private Object readResolve() {
        System.out.println("implementing readResolve!!!");
            return instance;
    }
    
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, IOException {
        SingletonTrial s1 = SingletonTrial.getInstance();
        SingletonTrial s2 = SingletonTrial.getInstance();

        System.out.println("s1: " +s1.hashCode());
        System.out.println("s2: " +s2.hashCode());

        Class c = Class.forName("com.oppo.util.SingletonTrial");
        Constructor<SingletonTrial> cons = c.getDeclaredConstructor();
        cons.setAccessible(true);

        /*Cloning: Cloning is discsouraged for the following reasons:
         * 1)Breaks singleton
         * 2) One needs to handle deep cloning and shallow cloning for mutable objects
         * More details: https://javarevisited.blogspot.com/2013/09/how-clone-method-works-in-java.html 
         * https://javarevisited.blogspot.com/2015/01/java-clone-tutorial-part-2-overriding-with-mutable-field-example.html
         *  
        */
        try {
            SingletonTrial s4 = (SingletonTrial) s2.clone();
            System.out.println("s4: " +s4.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //Relection
        /*  try {
            SingletonTrial s3 = cons.newInstance();
            System.out.println("s3: " +s3.hashCode());
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/  
        
        
        /*
         * Serialization and De-Serialization
         */
        String filename = "file.ser";
        FileOutputStream f = new FileOutputStream(filename);
        ObjectOutputStream o = new ObjectOutputStream(f);
        
        o.writeObject(s2);
        o.close();
        f.close();
        
        System.out.println("Obj has been serialized");
        
        
        FileInputStream fi = new FileInputStream(filename);
        ObjectInputStream oi = new ObjectInputStream(fi);
        
        SingletonTrial s5 = (SingletonTrial) oi.readObject();
        System.out.println("s5: "+ s5.hashCode());
        
        oi.close();
        fi.close();
        
    }
}
