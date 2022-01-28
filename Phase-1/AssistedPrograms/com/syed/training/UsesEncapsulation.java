package com.syed.training;

public class UsesEncapsulation {
	    private String Name; 
	    private int Roll; 
	    private int Age;
	    public int getAge()  
	    { 
	      return Age; 
	    } 
	    public String getName()  
	    { 
	      return Name; 
	    } 
	    public int getRoll()  
	    { 
	       return Roll; 
	    } 
	    public void setAge( int newAge) 
	    { 
	      Age = newAge; 
	    } 
	    public void setName(String newName) 
	    { 
	      Name = newName; 
	    } 
	    public void setRoll( int newRoll)  
	    { 
	      Roll = newRoll; 
	    } 
	
	    public static void main (String[] args)  
	    { 
	        UsesEncapsulation obj = new UsesEncapsulation(); 
	        obj.setName("Shalini"); 
	        obj.setAge(20); 
	        obj.setRoll(32); 
	        System.out.println("My name: " + obj.getName()); 
	        System.out.println("My age: " + obj.getAge()); 
	        System.out.println("My roll: " + obj.getRoll());      
	    } 
}
