package com.oppo.collections;

import java.util.ArrayList;
import java.util.List;

import com.oppo.model.Person;

public class ListExamples {


    public static void main(String[] args) {

        Person p1 = new Person("Snehal", 21, 253859);
        Person p2 = new Person("Ashok", 24, 715776);
        Person p3 = new Person("enSalh", 21, 253858);
        
        List<Person> listP = new ArrayList<>();
        listP.add(p1);
        listP.add(p2);
        listP.add(p3);
        
        System.out.println(listP.toString());
    }









}
