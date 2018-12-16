package com.oppo.util;

public class SingletonThread {
    
    public static SingletonThread instance = null; //Lazy Initialization 
    
    public SingletonThread() {
        System.out.println("Creating");
    }
    
    public static SingletonThread getInstance() {
        if(instance == null){
            instance = new SingletonThread();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonThread s1 = SingletonThread.getInstance();
        SingletonThread s2 = SingletonThread.getInstance();
        
        System.out.println("s1: " +s1.hashCode());
        System.out.println("s2: " +s2.hashCode());
        
        
    }
}
