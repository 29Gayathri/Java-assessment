//Question 5

import java.util.Scanner;
public class Arithmetic5 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first integer:");
		int firstint=in.nextInt();
        System.out.println("Enter second integer:");
        int secondint=in.nextInt();
        
        int add=firstint+secondint;
        System.out.println(add);
        int diff=firstint-secondint;
        System.out.println(diff);
        int product=firstint*secondint;
        System.out.println(product);
        int div=firstint/secondint;
        System.out.println(div);
	}

}
