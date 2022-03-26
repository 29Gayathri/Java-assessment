//Question 14 

public class InvoiceTest {
	class Invoice{
	String part_num ,part_des;
	int quan_purchased;
	double price_per_item;
	//constructors
     Invoice(String pm,String pd,int qp,double pp){
    	 this.part_num=pm;
    	 this.part_des=pd;
    	 this.quan_purchased=qp;
    	 this.price_per_item=pp;
     }
     //get and set method
     
     public void setpart_num(String part_num) {
    	 this.part_num=part_num;
     }
     public String getpart_num() {
    	 return part_num;
     }
     public void setpart_des(String part_des) {
    	 this.part_des=part_des;
     }
     public String getpart_des() {
    	 return part_des;
     }
     public void setquan_purchased(int quan_purchased) {
    	 this.quan_purchased=quan_purchased;
     }
     public int getquan_purchased() {
    	 return quan_purchased;
     }
     public void setprice_per_item(double price_per_item) {
    	 this.price_per_item=price_per_item;
     }
     public double getprice_per_item() {
    	 return price_per_item;
     }
     
     public void GetInvoiceAmount() {
    	 if(getquan_purchased()<0) {
    		 setquan_purchased(0);
    		 System.out.println("Quantity Purchased:"+getquan_purchased());
    		 if (getprice_per_item()<0){
    			setprice_per_item(0.0);
    			System.out.println("Price per Item:"+getprice_per_item());
    			}
    		 System.out.println("Invoice Amount:0");
    		 }
    	 else {
    		 double in_amt = getquan_purchased() * getprice_per_item();
    		 System.out.println("Invoice Amount:"+in_amt);
    	 }
     }
     public void main(String[] args){
    	 InvoiceTest obj=new InvoiceTest();
    	 Invoice obj1=obj.new Invoice("G231","soap",2,30);
    	 obj1.GetInvoiceAmount();
     }
}
}
