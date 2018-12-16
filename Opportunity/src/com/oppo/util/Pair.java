package com.oppo.util;

public class Pair implements Comparable<Pair>{
    
    private int a;
    private int b;
    
    public Pair(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }
    
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int compareTo(Pair o) {
        if(null!= o){
            return (this.a - o.getA());
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pair [a=");
        builder.append(a);
        builder.append(", b=");
        builder.append(b);
        builder.append("]");
        return builder.toString();
    }
       
}
