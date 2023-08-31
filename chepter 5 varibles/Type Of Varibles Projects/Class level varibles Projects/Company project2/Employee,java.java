//class level varibles 
class Employee{
int empId;
String empName;
String dept;
double esalary;
public static void main(String[] args){
Employee e1=new Employee();
System.out.println("Frist Employee Details");
e1.empId    = 01;
e1.empName = "Rohit";
e1.dept	   = "Real Esatate";
e1.esalary = 35000;
System.out.println("Print Frist Instance Details");
System.out.println("emId\t:"  + e1.empId);
System.out.println("emName\t:" + e1.empName);
System.out.println("dept\t:"   + e1.dept);
System.out.println("esalary\t:"+ e1.esalary);
}
}