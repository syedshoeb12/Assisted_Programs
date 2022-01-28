package com.syed.training;

public class UsingThrowFinalyThrows {

	 void Division() throws ArithmeticException
	    {
	        int a=45,b=0,rs;
	             rs = a / b;
	        System.out.print("\n\tThe result is : " + rs);
	    }
	 
	        public static void main(String[] args)
	        {
	        	int a=45,b=0,rs=0;
	        	UsingThrowFinalyThrows T = new UsingThrowFinalyThrows();
	            try
	           {
	               T.Division();
	           }
	           catch(ArithmeticException Ex)
	           {
	               System.out.print("\n\tError : " + Ex.getMessage());
	           }
	           System.out.print("\n\tEnd of program.");

	            

	            try
	            {
	                if(b==0)        
	                    throw(new ArithmeticException("Can't divide by zero."));
	                else
	                {
	                    rs = a / b;
	                    System.out.print("\n\tThe result is : " + rs);
	                }
	            }
	            catch(ArithmeticException Ex)
	            {
	                System.out.print("\n\tError : " + Ex.getMessage());
	            }

	            System.out.print("\n\tEnd of program.");
	            
	            
	            try
	            {
	                rs = a / b;
	            }
	            catch(ArithmeticException Ex)
	            {
	                System.out.print("\n\tError : " + Ex.getMessage());
	            }
	            finally
	            {
	                System.out.print("\n\tThe result is : " + rs);
	            }
	            
	          
	        }
	    }



  
         
