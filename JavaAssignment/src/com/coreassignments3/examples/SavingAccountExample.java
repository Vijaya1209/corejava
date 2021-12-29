package com.coreassignments3.examples;

import java.util.Scanner;

public class SavingAccountExample {

	 long id ;
	    double balance;
	    double withdraw;

	    public SavingAccountExample (long id, double balance,double  withdraw) throws Program3, Program4{
	        this.id=id;
	        this.balance=balance;
	        this.withdraw=withdraw;

	        withdrawFunctionality();
	    }

	    private void withdrawFunctionality() throws Program3, Program4{

	        if (balance == 0 || withdraw>balance) {
	            throw new Program3(" Insufficient Balance ");
	        }

	        else if(withdraw<0)

	        {
	            throw new Program4("Witdrawal amount cannot be negative");
	        }
	    }

	    public static void main(String[] args) throws Program3, Program4{

	        Scanner sc = new Scanner(System.in);

	        System.out.println(" Enter id :");
	        long id = sc.nextLong();

	        System.out.println(" Enter balance :");
	        double balance= sc.nextDouble();

	        System.out.println(" Enter amount to withdraw :");
	        double withdraw= sc.nextDouble();

	        /*System.out.println(" Enter amount to deposit :");
	        double deposit= sc.nextDouble();*/



	    }
}
