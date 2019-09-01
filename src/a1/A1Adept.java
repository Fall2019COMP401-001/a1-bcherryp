package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//get number of items and establish opening set of variables and objects
		int[] numItems = new int [scan.nextInt()];
		String[] item = new String [numItems.length];
		double[] price = new double [numItems.length];
		double totalPrice = 0;
		
		//for loop to scan the item names and prices
		for (int i = 0; i < numItems.length; i++) {
			item[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		
		//establishing second set of variables for second set of data
		int[] numCust = new int [scan.nextInt()];
		double[] total = new double [numCust.length];
		String[] Fname = new String [numCust.length];
		String[] Lname = new String [numCust.length];
		
		//for loop to scan the customer names and compute sum
		for (int i = 0; i < numCust.length; i++) {
			Fname[i] = scan.next();
			Lname[i] = scan.next();
			int count = scan.nextInt();
			
			//scanning last remaining items
			for (int c = 0; c < count; c++) {
				int multItems = scan.nextInt();
				String itemforTest = scan.next();
			
				//for and if loop for summation
					for (int n = 0; n < item.length; n++) {
						if (item[n].equalsIgnoreCase(itemforTest)) {
							total[i] += price[n] * multItems;
					}
								
				}
			
			}
	
		}
		//close the scanner
		scan.close();
		
		//establish variables for the max/min checks
		int custMax = 0;
		int custMin = 0;
		double minCompare = total[0];
		double maxCompare = total[0];
		
		//for and if/else loop to check for min and max
		for (int i = 0; i < total.length; i++) {
			totalPrice += total[i];
				if (maxCompare > total[i]) {
					custMax = i;
					maxCompare = total[i];
					} 	else if (minCompare < total[i]) {
							custMin = i;
							minCompare = total[i];
				}
		}
		//calculate average (only easy part)
		double Average = totalPrice / numCust.length;
		
		//the 3 system out messages with formatting
		System.out.println("Biggest: " + Fname[custMin] + " " + Lname[custMin] + " (" + String.format("%.2f",total[custMin]) + ")" );
		System.out.println("Smallest: " + Fname[custMax] + " " + Lname[custMax] + " (" + String.format("%.2f",total[custMax]) + ")" );
		System.out.println("Average: " + String.format("%.2f", Average));
		
	}
	
}