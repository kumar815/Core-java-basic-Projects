//class level varibles two types1)static2)non-static
class Home{
public static void main(String[] args){
//creating to instance from the class Buying details
Buying b1=new Buying();
Buying b2=new Buying();
Buying b3=new Buying();
Buying b4=new Buying();

//storing Buying object buyers Valuesin b1 instance
b1.Buy_Id=10;
b1.Buy_Name="Ramesh Chakri";
b1.Buy_Location="Dubai";
b1.Project_BluePrint="Yes";
b1.Contact_Number=+11405788L;
b1.Email_Id="prefix_dubai";
b1.Address="abu hali 3rd street dubai";
b1.Advance_Amount=1115000;
b1.time="2 Month";
b1.Loantype="Mortgauge";
b1.Bank_Name="Emirates Islamic";
b1.Total_Amount=2_00_00_000L;
//Dispaly to b1 Details
System.out.println("buy b1 Values inside Detailes:");
System.out.println("\tBuy_Id         :"+b1.Buy_Id);
System.out.println("\tBuy_name       :"+b1.Buy_Name);
System.out.println("\tBuy_Location   :"+b1.Buy_Location);
System.out.println("\tProject_BP     :"+b1.Project_BluePrint);
System.out.println("\tCon_Num        :"+b1.Contact_Number);
System.out.println("\tEmail_Id       :"+b1.Email_Id);
System.out.println("\tAddress        :"+b1.Address);
System.out.println("\tTime           :"+b1.time);
System.out.println("\tLoantype       :"+b1.Loantype);
System.out.println("\tBank_Name      :"+b1.Bank_Name);
System.out.println("\tTotal_Amount   :"+b1.Total_Amount);
//create b2 store values
//change the id,name,l,,b,n,i,a,a,t,lo,b,ba
//remaining values alredy declared  to static
b2.Buy_Id=20;
b2.Buy_Name="Milan";
b2.Buy_Location="INDIA";
b2.Project_BluePrint="Yes";
b2.Contact_Number=9035616346L;
b2.Email_Id="prefix_india";
b2.Address="Btm layout Bangalore";
b2.Advance_Amount=1_00_000;
b2.time="5 Month";
b2.Loantype="Smart_PMJd";
b2.Bank_Name="Indian_bank";
b2.Total_Amount=2_00_00_000L;
//Dispaly to b2 Details
//this values all static displayed
System.out.println("\n\nbuy b2 Values inside Detailes:");
System.out.println("\tBuy_Id         :"+b2.Buy_Id);
System.out.println("\tBuy_name       :"+b2.Buy_Name);
System.out.println("\tBuy_Location   :"+b2.Buy_Location);
System.out.println("\tProject_BP     :"+b2.Project_BluePrint);
System.out.println("\tCon_Num        :"+b2.Contact_Number);
System.out.println("\tEmail_Id       :"+b2.Email_Id);
System.out.println("\tAddress        :"+b2.Address);
System.out.println("\tTime           :"+b2.time);
System.out.println("\tLoantype       :"+b2.Loantype);
System.out.println("\tBank_Name      :"+b2.Bank_Name);
System.out.println("\tTotal_Amount   :"+b2.Total_Amount);
//dispaly b3 store values used to static  
System.out.println("\n\nbuy b3 Values inside Detailes:");
System.out.println("\tBuy_Id         :"+b3.Buy_Id);
System.out.println("\tBuy_name       :"+b3.Buy_Name);
System.out.println("\tBuy_Location   :"+b3.Buy_Location);
System.out.println("\tProject_BP     :"+b3.Project_BluePrint);
System.out.println("\tCon_Num        :"+b3.Contact_Number);
System.out.println("\tEmail_Id       :"+b3.Email_Id);
System.out.println("\tAddress        :"+b3.Address);
System.out.println("\tTime           :"+b3.time);
System.out.println("\tLoantype       :"+b3.Loantype);
System.out.println("\tBank_Name      :"+b3.Bank_Name);
System.out.println("\tTotal_Amount   :"+b3.Total_Amount);

//dispaly b4 static values
//only change id,Name,number
//static used to ther options
b4.Buy_Id=33;
b4.Buy_Name="anand";
b4.Contact_Number=7892884800L;
System.out.println("\n\nbuy b4 Values inside Detailes:");
System.out.println("\tBuy_Id         :"+b4.Buy_Id);
System.out.println("\tBuy_name       :"+b4.Buy_Name);
System.out.println("\tBuy_Location   :"+b4.Buy_Location);
System.out.println("\tProject_BP     :"+b4.Project_BluePrint);
System.out.println("\tCon_Num        :"+b4.Contact_Number);
System.out.println("\tEmail_Id       :"+b4.Email_Id);
System.out.println("\tAddress        :"+b4.Address);
System.out.println("\tTime           :"+b4.time);
System.out.println("\tLoantype       :"+b4.Loantype);
System.out.println("\tBank_Name      :"+b4.Bank_Name);
System.out.println("\tTotal_Amount   :"+b4.Total_Amount);
 }
}