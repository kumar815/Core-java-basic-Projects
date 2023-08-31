import java.util.Scanner;
class Collage{
public static void main(String[] args){
Scanner scn= new Scanner(System.in);

Student s1 = new Student();
System.out.println("s1 Detailes");
System.out.println(s1);

System.out.println("Enter Student Id");
int sno= scn.nextInt(); scn.nextLine();

System.out.println("Enter Student Name");
String sname = scn.nextLine();

System.out.println("Enter Student Course");
String course = scn.nextLine();

System.out.println("Enter Student Fee");
double fee = scn.nextDouble(); 

System.out.println("Enter Student Mobile");
long mobile = scn.nextLong();

System.out.println("Enter Student gender");
char gender = scn.next().charAt(0);

//System.out.println("Enter Student Course (Y/N)");
//boolean courseCompleted = scn.nextBoolean();
System.out.print("Enter courseCompeleted(Y/N): ");
		String courseCompleted = scn.next();

		if(courseCompleted.equalsIgnoreCase("Y"))
			s1.setcourseCompleted(true);
		else
			s1.setcourseCompleted(false);

		System.out.println("\ns1 details");
		System.out.println(s1);
}
}
