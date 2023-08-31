//static and non static method implementing
class H_Sourece{
  public static void main(String[] args){
    Course c1=new Course();
	Course c2=new Course();
	//Declared Statements
	c1.C_Name="gourish";
    c1.Mobile_Num=+919035616346L;
    c1.Email_Id="anand@gmail.com";
    System.out.println("***c1 Course Details***");
    System.out.println("C_Name      :"+c1.C_Name);
    System.out.println("course_Name :"+c1.course_Name);
    System.out.println("Mobile_Num  :"+c1.Mobile_Num);
    System.out.println("Email_Id    :"+c1.Email_Id);
    System.out.println("Pincode     :"+c1.Pincode);
    System.out.println("course_id   :"+c1.course_id);
    System.out.println("Course_Fee  :"+c1.Fee);

	System.out.println("\n***c2 Course Details***");
	c2.C_Name="Rajnith";
	c2.Mobile_Num=+6322055667L;
    c2.Email_Id="tarrreib23@gmail.com";
	System.out.println("C_Name      :"+c2.C_Name);
    System.out.println("course_Name :"+c2.course_Name);
    System.out.println("Mobile_Num  :"+c2.Mobile_Num);
    System.out.println("Email_Id    :"+c2.Email_Id);
    System.out.println("Pincode     :"+c2.Pincode);
    System.out.println("course_id   :"+c2.course_id);
    System.out.println("Course_Fee  :"+c2.Fee);
    }
    }
