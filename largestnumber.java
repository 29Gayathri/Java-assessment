import java.util.Scanner;
public class largestnumber {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
        System.out.println("First integer:");
	    int firstint=in.nextInt();
        System.out.println("Second interger:");
        int secondint=in.nextInt();
         if(firstint>secondint)
         {
        	 System.out.println(firstint + "is large");
         }
         else if(firstint<secondint)
         {
        	 System.out.println(secondint + "is large");
         }
         else
         {
        	 System.out.println("These numbers are equal");
         }
	}
}
