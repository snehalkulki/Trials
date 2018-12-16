package com.oppo.util;

import javax.swing.text.AbstractDocument.LeafElement;

public class StringTrial{

    /**
     * @param args
     */
    public static void main(String[] args) {

        String a = new String("Snehal");
        String b = "hjhjk";
        String c = "Snehal";

        //equals and ==
        System.out.println(a.equals(c));
        System.out.println(a == c);


        //hashcodes of Strings 
        System.out.println("a: "+a.hashCode());
        System.out.println("b: " + b.hashCode());

        System.out.println("c : " + c.hashCode());

        //sub string creates a new obj cos String is immutable
        System.out.println("c sub :" +c.substring(2).hashCode());

        CharSequence cs = "Snehal";
        StringBuilder sba = new StringBuilder(cs);

        System.out.println("sba : " + sba.hashCode());

        //hashcode is same, but not same obj
        System.out.println("sba sub same as c sub:  "+sba.substring(2).hashCode());
        System.out.println(c.substring(2).hashCode() == sba.substring(2).hashCode());
        System.out.println(c.substring(2).equals(sba.substring(2)));
        System.out.println(c.substring(2) == sba.substring(2));//false

        System.out.println("sba sub:  "+sba.substring(3).hashCode());

        //same obj
        System.out.println("sba append : "+sba.append("dhyhjkl").hashCode());
        System.out.println(sba == sba.append("dhyhjkl"));//true

        //HashCode of empty String
        String emptyS= new String();
        System.out.println(emptyS.hashCode());

        //String implements Comparable interface
        //StringBuilder and buffer implement Appendable interface.

        //Palindroem


        //With StringBuilder
        StringBuilder p = new StringBuilder().append("lahenS");

        /* if(p.reverse().toString().equals(a))
        System.out.println(a +" and " +p.reverse() +" forms a PAlindrome");*/

        //With String only
        String ps = new String("lahenS");
        System.out.println(isPalindroemWithString(a, ps)); 

        StringBuilder palin  = new StringBuilder("aviva");
        System.out.println(palin.reverse().equals(palin));

    }


    public static boolean isPalindroemWithString(String aa, String psa){

        if(aa.length() == psa.length()){

            for(int i=0; i<aa.length(); i++){
                if(aa.charAt(i) != psa.charAt(psa.length()-1-i)){
                    return false;
                }                
            }
            System.out.println(aa +" and " +psa +" forms a PAlindrome");
        } else {
            System.err.println(aa +" and " +psa + "Not a palindrome");
            return false;
        }
        return true;
    }

    private static boolean isAPalindrome(String pali){

        for (int i=0; i<pali.length()/2; i++){
            if(pali.charAt(i)!=pali.charAt(pali.length()-i-1)){
                return false;
            }
        }
        return true;        
    }
}