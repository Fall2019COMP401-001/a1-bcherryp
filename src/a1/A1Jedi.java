package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//establish initial variables and scan first integer
		int[] numItems = new int [scan.nextInt()];
		String[] item = new String [numItems.length];
		double price = 0.00;
		int[] tester = new int [numItems.length];
		
		/*for loop similar to A1Adept since input is the same. made variables
		for things i didn't need to keep.*/
		for (int i = 0; i < numItems.length; i++) {
			item[i] = scan.next();
			price = scan.nextDouble();
		}
		
		/*establishing second set of variables for second set of data and 
		again not keeping data that isnt needed for output*/
		int[] numCust = new int [scan.nextInt()];
		
		//for loop, ignoring most of the scanned objects by not saving in array
		// but this should scan what we want and keep track of how many are bought
		for (int i = 0; i < numCust.length; i++) {
			String Fname = scan.next();
			String Lname = scan.next();
			int count = scan.nextInt();
			
			//scanning last remaining items and adding to tester for number of items
			for (int c = 0; c < count; c++) {
				int multItems = scan.nextInt();
				String testName = scan.next();
				for (int n = 0; n < item.length; n++) {
					if (testName.equalsIgnoreCase(item[n])) {
						numItems[n] += multItems;
						tester[n]++;
					}
				}
			}
		}
		//close scanner since scanning is done scanning all the scans.
			scan.close();
		
		//for and if/else loop to print out the number and name of items.
		for (int i = 0; i < numItems.length; i++) {
			if (tester[i] == 0) {
				System.out.println("No customers bought " + item[i]);
			} else {
				System.out.println(tester[i] + " customers bought " + numItems[i] + " " + item[i]);
			}
		}
	}
}
