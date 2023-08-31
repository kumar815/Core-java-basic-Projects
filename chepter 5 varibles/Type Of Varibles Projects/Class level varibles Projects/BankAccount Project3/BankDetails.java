//class level varibles
class BankDetails{
public static void main(String[] args){
BankAccount a1=new BankAccount();
BankAccount a2=new BankAccount();

System.out.println("Icici Bank Details shown below");
a1.Bank_Name			="Icici Bank";
a1.Account_Number		=23421001038444L;
a1.Account_Holder_Name	="P Anandkumar Reddy";
a1.Branch				="Hongasandra";
a1.Ifsc_Code			="UBIN24321";
a1.Mobile_number		="+91 9035616346";
a1.Customar_Id			=560068;
a1.Deposite_amount		=4500;
System.out.println("BankName       :"+a1.Bank_Name);
System.out.println("Account_Number :"+a1.Account_Number);
System.out.println("Account_Holder :"+a1.Account_Holder_Name);
System.out.println("Branch         :"+a1.Branch);
System.out.println("Ifsc_code      :"+a1.Ifsc_Code);
System.out.println("Mobile_Number  :"+a1.Mobile_number);
System.out.println("Customar_id    :"+a1.Customar_Id);
System.out.println("Deposite_amount:"+a1.Deposite_amount);

System.out.println("\nIdbi Bank Details shown below");
a2.Bank_Name			="Idbi Bank";
a2.Account_Number		=32890004566L;
a2.Account_Holder_Name	="Anandkumar Reddy p";
a2.Branch				="Koramangala";
a2.Ifsc_Code			="Idbi9021";
a2.Mobile_number		="+91 9035616346";
a2.Customar_Id			=347788;
a2.Deposite_amount		=500;
System.out.println("BankName       :"+a2.Bank_Name);
System.out.println("Account_Number :"+a2.Account_Number);
System.out.println("Account_Holder :"+a2.Account_Holder_Name);
System.out.println("Branch         :"+a2.Branch);
System.out.println("Ifsc_code      :"+a2.Ifsc_Code);
System.out.println("Mobile_Number  :"+a2.Mobile_number);
System.out.println("Customar_id    :"+a2.Customar_Id);
System.out.println("Deposite_amount:"+a2.Deposite_amount);
}
}
