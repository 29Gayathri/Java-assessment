//Question.10

import java.util.Scanner;
public class volumeofsphere {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the radius of sphere:");
	    double radius =in.nextInt();
		
		double result=spherevolume(radius);
		System.out.println("the volume of sphere:" + result);
	}

		public static double spherevolume(double radius) {
			double volume=(((radius*radius*radius)*4)*22)/21;
			return volume;
			
		}

}
