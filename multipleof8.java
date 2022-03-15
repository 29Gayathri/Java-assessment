import java.util.Scanner;
public class multipleof8 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("First Integer:");
		int firstint=in.nextInt();
		System.out.println("Second Integer:");
		int secondint=in.nextInt();
		
		int multiple=secondint*secondint;
		if(firstint==multiple)
		{
			System.out.println("Secondint is the multiple of firstint");
		}
		else
		{
			System.out.println("Secondint is not the multiple of firstint");
		}
	}

}
