package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		//get count of number of inputs
		int numCustomers = scan.nextInt();
		
		//list of objects and values I will need
		String Fname;
		String Lname;
		String Finitial;
		String itemName;
		int numItems;
		double multItems;
		double price;
		double sum = 0;
		double previous = 0;
		double Ssum;
		String[] receipt = new String[numCustomers];
		
		//for loop to step through scanner inputs
		for (int i = 0; i < numCustomers; i++) {
			Fname = scan.next();
			Finitial = Fname.substring(0, 1) + ".";
			Lname = scan.next();
			numItems = scan.nextInt();
			//String to keep track of the totals
			String[] total = new String [numItems];
			//for loop to get sum of items and print
			for (int n = 0; n < numItems; n++) {
				if(n == 0) {
					previous = 0;
				}
				multItems = scan.nextInt();
				itemName = scan.next();
				price = scan.nextDouble();
				//calculate sum
				sum = multItems*price;
				Ssum = (previous + sum);
				previous = Ssum;
				
				String Final = String.format("%.2f", Ssum);
				
				//get the total to send to the receipt to print.
				total[n] = Final;
				
				
				}
			
		
			receipt[i] = Finitial + " " + Lname + ": " + total[numItems-1];
			
		}
		for (int i = 0; i < numCustomers; i++) {
			
			System.out.println(receipt[i]);
		
		}
		scan.close();
	}
}
