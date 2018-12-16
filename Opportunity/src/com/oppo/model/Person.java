package com.oppo.model;

public class Person {
    
    private String name;
    private int age;
    private int id;
    
        
    public Person(String name, int age, int id) {
        super();
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Person [name=");
        builder.append(name);
        builder.append(", age=");
        builder.append(age);
        builder.append(", id=");
        builder.append(id);
        builder.append(", hashcode=");
        builder.append(hashCode());
        builder.append("]");
        return builder.toString();
    }
    
    
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if((obj instanceof Person) && this.getName().equals(obj)){
            return true;
        } else {
            return false;
        }
    }
    
    
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return this.getId()*13;
    }

}
