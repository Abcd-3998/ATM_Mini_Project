package com.project;
import java.util.Scanner;

public class ATM_Mini_Project {

	public static void main(String[] args) {
		
      int pin=1234;
      int balance=10000;
      int addAmount=0;
      int takeAmount=0;
      String name;
      
      Scanner scanner=new Scanner(System.in);
      
      //we have to taken an input by an user
      System.out.println("Enter your Pin number");
      
      int password=scanner.nextInt();
      if(password==pin)
      {
    	  System.out.println("Enter your Name");
    	  name=scanner.next();
    	  System.out.println("Welcome "+ name);
    	  while(true)
    	  {
    		  System.out.println("Press 1 to check your balance");
    		  System.out.println("Press 2 to add amount ");
    		  System.out.println("Press 3 to take amount");
    		  System.out.println("Press 4 to take receipt");
    		  System.out.println("press 5 to EXIT");
    		  System.out.println("===========================================");
    		  
    		  int opt=scanner.nextInt();
    		  switch(opt)
    		  {
    		  case 1:
    			  System.out.println("Your current balance"+balance);
    			  break;
    		  case 2:
    			  System.out.println("How much amount did your want add?");
    			  addAmount=scanner.nextInt();
    			  System.out.println("Successfully Credited");
    			  balance=addAmount+balance;
    			  //10000=100+10000
    			  //10100
    			  break;
    		  case 3:
    			  System.out.println("How much amount did you want take? ");
    			  takeAmount=scanner.nextInt();
    			  if(takeAmount>balance)
    			  {
    				  System.out.println("your balance is insuffient");
    				  System.out.println("try less than your available balance");
    				  
    			  }
    			  else
    			  {
    				  System.out.println("successfully taken");
    				  balance=balance - takeAmount;
    				  //balance=10100-100
    				  //balance=10000
    			  }
    			  break;
    		  case 4:
    			  System.out.println("Welcome to all in One mini ATM");
    			  System.out.println("Available balance is "+balance);
    			  System.out.println("Amount deposited "+addAmount);
    			  System.out.println("Amount taken "+ takeAmount);
    			  System.out.println("Thanks for Coming ");
    			  System.out.println("===========================================");
    			  break;
    			  
    			  
    		  }
    		  if(opt==5)
    		  {
    			  System.out.println("Thankyou");
    			  break;
    		  }
    	  }
      }
      else
      {
    	  System.out.println("Wrong pin number ");
    	  
      }
      
	}

}
