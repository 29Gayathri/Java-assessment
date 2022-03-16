// Question 13


public class Account {
	 void Debit(int debt_amt ,int acc_bal) {
		 if(debt_amt>acc_bal)
		 {
			System.out.println(" debit amount exceeded account balance");
		 }
		 else
		 {
			 int current_bal=acc_bal-debt_amt;
			 System.out.println("Your Amount has been debited");
			 System.out.println("current Balance in your account:"+current_bal);
		 }
	 }
	 public static void main(String args[]) {
	       int acc_bal=20000;
	       int debt_amt=15000;
	       Account obj=new Account();
	       obj.Debit(debt_amt,acc_bal);
		 
	 }

}
