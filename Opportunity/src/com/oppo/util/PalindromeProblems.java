package com.oppo.util;

import java.util.ArrayList;
import java.util.List;

public class PalindromeProblems {
    
    
    public static void main(String[] args) {
        
        ArrayList<String> a1 = new ArrayList<String>();
        ArrayList<String> sc = new ArrayList<String>();
        List<ArrayList<String>> a2 = new ArrayList<ArrayList<String>>();
        String np= null;
        
        String pali = "NITIN";
       // String pali = "ababbbabbababa";
                
        if(isAPalindrome(pali)){
            a1.add(pali);
        }
        
        for (int i=0; i < pali.length() ; i++) {
            Character sp = pali.charAt(i);
            sc.add(sp.toString());
            boolean f1 = false;
            
            for (int j=i+1; j<pali.length()-1; j++ ){
                
                if(j == i+1){
                    np = sp.toString() + pali.charAt(j);    
                } else {
                    np = np + pali.charAt(j);
                }
                if(isAPalindrome(np)){
                    a1.add(np);
                    f1=true;
                }              
            }
        }
        a2.add(a1);
        a2.add(sc);  
        printPalindrome(a2);
        
    }
    
    private static boolean isAPalindrome(String pali){
        
        for (int i=0; i<pali.length()/2; i++){
            if(pali.charAt(i)!=pali.charAt(pali.length()-i-1)){
                return false;
            }
        }
        return true;        
    }
    
    
    private static void printPalindrome(List<ArrayList<String>> a2){
        
        for (ArrayList<String> l : a2) {
            for (String string : l) {
                System.out.println(string);
            }
        }
    }
}
