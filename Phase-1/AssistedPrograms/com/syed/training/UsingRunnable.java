package com.syed.training;

public class UsingRunnable implements Runnable {

			 
		    public static int myCount = 0;
		    public UsingRunnable(){
		         
		    }
		    public void run() {
		        while(UsingRunnable.myCount <= 10){
		            try{
		                System.out.println("Expl Thread: "+(++UsingRunnable.myCount));
		                Thread.sleep(100);
		            } catch (InterruptedException iex) {
		                System.out.println("Exception in thread: "+iex.getMessage());
		            }
		        }
		    } 
		    public static void main(String a[]){
		        System.out.println("Starting Main Thread...");
		        UsingRunnable mrt = new UsingRunnable();
		        Thread t = new Thread(mrt);
		        t.start();
		        while(UsingRunnable.myCount <= 10){
		            try{
		                System.out.println("Main Thread: "+(++UsingRunnable.myCount));
		                Thread.sleep(100);
		            } catch (InterruptedException iex){
		                System.out.println("Exception in main thread: "+iex.getMessage());
		            }
		        }
		        System.out.println("End of Main Thread...");
		    }
		}


