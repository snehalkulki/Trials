package com.oppo.util;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ChainofPairs {

    public static void main(String[] args) {
        
        
       List<Pair> a = new ArrayList<Pair>();
       Pair p1 = new Pair(20, 24);
       Pair p2 = new Pair(90, 104);
       Pair p3 = new Pair(9, 19);
       Pair p4 = new Pair(50, 84);
       Pair p5 = new Pair(03, 184);
       Pair p6 = new Pair(200, 8);
     
       a.add(p1);
       a.add(p2);
       a.add(p3);
       a.add(p4);
       a.add(p5);
       a.add(p6);
       
       Collections.sort(a);
       
       for (Pair pair : a) {
        System.out.println(pair.toString());
    }
       
       
       int count = 0;
       
       for (int i=1; i<a.size(); i++){
           if (a.get(i).getB() > a.get(i-1).getB())
           {
               count++;     
           }
       }
       System.out.println("Max Count is "+ count);
       
       /*Pair arrPairs[]= new Pair[] {new Pair(20, 24) , new Pair(90, 104), new Pair(9, 19), new Pair(50, 84)};
       
       for(Pair p : arrPairs){
           
       
       }*/
       
       
    }
    
}
