package com.syed.training;

public class UsingThread extends Thread {
	
		 	public void run()
		 	{
		  		System.out.println("concurrent thread started running..");
		}
		 	public static void main( String args[] )
		 	{
		  		UsingThread mt = new  UsingThread();
		  		mt.start();
		 	}
		}


	


