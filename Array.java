//Question 11

public class Array {
     public static void main(String args[]) {
    	   
    	 int array[]= {0,0,0,0,0,0,0,0,0,0}; //ten elements of integer in array
    	 
    	 int bonus[];
    	 bonus=new int[15];
    	 for (int i=0;i<15;i++)
    	 bonus[i]+=1;
    	 System.out.println(bonus);   //adding 1 to each 15 elements
    	 
    	 int bestscores[]= {50,60,70,80,90};
    	 for(int j=0;j<5;j++)
    	 {
    		 System.out.println(bestscores[j]);  //display best scores
    	 }
    	 
    	 
     }
}
