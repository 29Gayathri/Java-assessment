//Question 16

public class DateTest {
	class Date{
		int mon,date,year;
 Date(int m,int d,int y){
	 int mon=m;
	 int date=d;
	 int year=y;
 }
public void setmon(int mon) {
	 this.mon=mon;
 }
public int getmon() {
	return mon;
}
public void setdate(int date) {
	this.date=date;
}
public int getdate(){
	return date;
}
public void setyear(int year) {
	this.year=year;
}
public int getyear() {
	return year;
}
    public void displayDate(){
    	System.out.println("Date:"+ getdate()+ "/" + getmon() +"/" + getyear() +"/");
    	 }
    public void main(String args[]) {
    	DateTest obj=new DateTest();
    	Date obj1=obj.new Date(9,29,2001);
    	obj1.displayDate();
    }
	}
	

}
