package com.syed.training;

public class UsingMethods {
		//method demo	

		public int multipynumbers(int a,int b) {
			int z=a*b;
			return z;
		}
  //call by value
		 int val=150;

			int operation(int val) {
				val =val*10/100;
				return(val);
			}
//method overloading			
			public void area(int b,int h)
		    {
		         System.out.println("Area of Triangle : "+(0.5*b*h));
		    }
		    public void area(int r) 
		    {
		         System.out.println("Area of Circle : "+(3.14*r*r));
		    }

		public static void main(String[] args) {

			UsingMethods b=new UsingMethods();
			int ans= b.multipynumbers(10,3);
			System.out.println("Multipilcation is :"+ans);
			
			UsingMethods d = new UsingMethods();
			System.out.println("Before operation value of data is "+d.val);
			d.operation(100);
			System.out.println("After operation value of data is "+d.val);
			
			UsingMethods ob=new UsingMethods();
		       ob.area(10,12);
		       ob.area(5); 
			}		

	}


