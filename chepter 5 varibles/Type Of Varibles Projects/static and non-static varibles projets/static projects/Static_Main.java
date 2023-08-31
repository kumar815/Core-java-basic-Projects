//static varibles
//static only used to class inside can't used to method inside
//class inside wrote the typeof varibles must be creat object
class Static_Main{
public static void main(String[] args){
Static s1=new Static();
Static s2=new Static();

s1.Company ="hcl";
s1.Location="Bangalore";
s1.Branches  ="hsr";
System.out.println(s1.Company);
System.out.println(s1.Location);
System.out.println(s1.Branches);

System.out.println(s2.Company);
System.out.println(s2.Location);
System.out.println(s2.Branches);
}
}