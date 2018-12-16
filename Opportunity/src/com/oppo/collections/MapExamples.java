package com.oppo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.oppo.model.Person;

public class MapExamples {

    public static void main(String[] args) {
        Person p1 = new Person("Snehal", 21, 253859);
        Person p2 = new Person("Ashok", 24, 715776);
        Person p3 = new Person("enSalh", 21, 253858);
        
      /*  Map<Integer,Person> m1 = new HashMap<Integer, Person>();
        m1.put(p1.getId(), p1);
        m1.put(p2.getId(), p2);
        m1.put(p3.getId(), p3);
        
        Integer i = new Integer(253859);*/
        
       /* System.out.println(m1.get(i));
        System.out.println(m1.get(253859));
        
        System.out.println(m1.toString());*/
        
        Person p4 = new Person("Snehal", 25, 253858);
        
        Map<String,Person> m2 = new HashMap<String, Person>();
        m2.put(p1.getName(), p1);
        m2.put(p2.getName(), p2);
        m2.put(p3.getName(), p3);
        m2.put(p4.getName(), p4);
        
        Set keyS = m2.keySet();
        System.out.println(keyS.toString());
        
        
        
        String name = new String("Snehal");
        
        System.out.println(m2.get(name));
        System.out.println(m2.get("enSalh"));
        
        System.out.println(m2.toString());
    }

    
    
}
