package com.syed.training;

public class ObjectClass {
		    String name; 
		    String breed; 
		    int age; 
		    String color; 
		    public ObjectClass(String name, String breed, int age, String color) 
		    { 
		        this.name = name; 
		        this.breed = breed; 
		        this.age = age; 
		        this.color = color; 
		    } 
		    public String getName() 
		    { 
		        return name; 
		    } 
		    public String getBreed() 
		    { 
		        return breed; 
		    } 
		    public int getAge() 
		    { 
		        return age; 
		    } 
		    public String getColor() 
		    { 
		        return color; 
		    } 
		    @Override
		    public String toString() 
		    { 
		        return("Hi my name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and"+ this.getColor() + "."); 
		    } 
		    public static void main(String[] args) 
		    { 
		        ObjectClass scott = new ObjectClass("Scott","papillon", 5, "black"); 
		        System.out.println(scott.toString());
		        System.out.println();
		        
		        Sum s = new Sum(); 
		        System.out.println("Polymorphism");
		        System.out.println(s.sum(10, 20)); 
		        System.out.println(s.sum(10, 20, 30)); 
		        System.out.println(s.sum(10.5, 20.5)); 
		        System.out.println();
		      
		           System.out.println("Inheritance");
		                MountainBike mb = new MountainBike(3, 100, 25); 
		                System.out.println (mb.toString());
		             
		        }
		    } 
		
//uses of Polymorphism
class Sum 
{
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    }  
}
//Uses of Inheritance
class Bicycle  
{ 
    public int gear; 
    public int speed; 
    public Bicycle(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
    public void speedUp(int increment) 
    { 
        speed += increment; 
    }  
    public String toString()  
    { 
        return("No of gears are " + gear + "\n" + "speed of bicycle is " + speed); 
    }  
} 
class MountainBike extends Bicycle  
{ 
    public int seatHeight; 
    public MountainBike(int gear,int speed,int startHeight) 
    {  
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    } 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nseat height is "+seatHeight); 
    } 
}







	


