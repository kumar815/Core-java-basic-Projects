//static varibles
//static only used to class inside can't used to method inside
//class inside wrote the typeof varibles must be creat object
class Non_Sta{
public static void main(String[] args){
Non s1=new Non();
Non s2=new Non();
//s1.values declared one time only s.also print values same
//this is a static keyword use it 
//example company detailes
s1.Company   ="hcl";


s1.Location ="Bangalore";
s1.Branches ="hsr";
System.out.println(s1.Company);
System.out.println(s1.Location);
System.out.println(s1.Branches);
//company value 2 detailes
s2.Company  ="Bmw";
s2.Location ="Mangalore";
s2.Branches ="btm";
System.out.println(s2.Company);
System.out.println(s2.Location);
System.out.println(s2.Branches);
}
}