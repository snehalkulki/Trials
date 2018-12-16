package com.oppo.util;

import com.opp.interfaces.Drawing;

public class LambdaTrial {
    
    public static void main(String[] args) {
        Drawing d = () -> {
            System.out.println("This is draw!!!");    
        };
        
        d.draw();
    }
   
}
