//Question 9

import java.util.Scanner;
public class Counterlargest {
	public static void main(String args[]) {
		int counter ,number,largest=0;
		//a
		 for(counter=0;counter<10;counter++)
		 {
			 System.out.println("The counter numbers are:" + counter);
		 }
		//b
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the largest number:");
		 number=sc.nextInt();
		 largest=largest>number ?largest:number;
		//c
		 System.out .println(" The largest number is" + largest);
		 
	}
}
	