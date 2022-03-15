import java.util.Scanner;
public class Arithmetic7 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("First integer:");
		int firstint=in.nextInt();
		System.out.println("Second integer:");
		int secondint=in.nextInt();
		System.out.println("Third integer:");
		int thirdint=in.nextInt();
		 
		int sum =firstint+secondint+thirdint;
		System.out.println(sum);
		int product=firstint*secondint*thirdint;
		System.out.println(product);
		int avg = sum/3;
		System.out.println(avg);
		if(firstint>=secondint && firstint>=thirdint)
		{
			System.out.println("The largest number is" + firstint);
		}
		else if(secondint>=firstint && secondint>=thirdint)
		{
			System .out.println("The largest number is" + secondint);
		}
		else
		{
			System .out.println("The largest number is" + thirdint);
	} 
		
		if(firstint<=secondint && firstint<=thirdint)
		{
			System.out.println("The smallest number is" + firstint);
		}
		else if(secondint<=firstint && secondint<=thirdint)
		{
			System .out.println("The smallest number is" + secondint);
		}
		else
		{
			System .out.println("The smallest number is" + thirdint);
	} 

}
}