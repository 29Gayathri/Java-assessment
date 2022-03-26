//Question 15

public class EmployeeTest {
	 class Employee{
		 String first_name;
		 String last_name;
		 double mon_salary;
		 
Employee(String fn,String ln,double ms){
	this.first_name=fn;
	this.last_name=ln;
	this.mon_salary=ms;
	}
public void setfirst_name(String first_name) {
	this.first_name=first_name;
}
public String getfirst_name() {
   return first_name;
}
public void setlast_name(String last_name) {
	this.last_name=last_name;
}
public String getlast_name() {
   return last_name;
}
public void setmon_salary(double mon_salary) {
	this.mon_salary=mon_salary;
}
public double getmon_salary() {
   return mon_salary;
}	
public void yearSalary() {
	if(getmon_salary()<0) {
		setmon_salary(0.0);
		System.out.println("Name:"+getfirst_name() +" "+getlast_name());
		System.out.println("Yearly Salary:"+ mon_salary);
	}
	else {
		double year_salary=getmon_salary()*12;
		System.out.println("Name:"+getfirst_name()+" "+getlast_name());
		System.out.println("Yearly Salary:"+year_salary);
	}
	
}
 public void AfterIncr() {
	 double incr_amt=(getmon_salary()*10)/100;
	 double tot_salary=incr_amt +getmon_salary();
	 System.out.println("Name:"+getfirst_name()+" "+getlast_name());
	 System.out.println("After 10% raise yearly salary:" +tot_salary*12);
	 }
	 public void main(String args[]) {
		 EmployeeTest obj=new EmployeeTest();
		 Employee obj1=obj.new Employee("Gayu","S",25000);
		 Employee obj2=obj.new Employee("Harshu","B",30000);
		 obj1.yearSalary();
		 obj2.yearSalary();
		 obj1.AfterIncr();
		 obj2.AfterIncr();
		}

}
}
