package IfElse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {
	

	public static void Priting2() {
		System.out.println("This is an exmpale of linear inheritance");
	}
	
	public static void OddNumbers() {
		List <Integer> intArray = new ArrayList<Integer>();
		for (int i=1;i<=100;i++) {
				intArray.add(i);
		}
		System.out.println(intArray.toString());
	}
	
	public static void TaxFree() {
		int bill = 0;
		int bill1 = 0;
		int bill2 = 0;
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter count of Items Purchased");
	    String count = myObj.nextLine(); 
	    int count1 =  Integer.parseInt(count);
	    for (int i =1; i<=count1; i++) {
	    System.out.println("Enter price of item " + i);
	    String count2 = myObj.nextLine(); 
	    bill=  Integer.parseInt(count2);
	    if (bill>=20) {
	    	bill1 = bill;
	    	System.out.println("This is greater than 20 "+bill);
	    }else {bill2 = bill;
	    	System.out.println("This is less than 20 "+bill);
	    }
	    }bill = bill1+bill2; 
	    System.out.println("Total bill is : " + bill );
	    }
	
	 }
