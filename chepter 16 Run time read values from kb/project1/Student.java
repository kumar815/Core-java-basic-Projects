//reading runtime values form keyboard
//develop the program input values  from key board student class
//used to sno,sname,coures,fee,mobile,gender,course completed datiles 
//we must use develop the progrme two classCollage class Scanner to reed input kb
//student class reading value and collage class connecting
//Collage class Scanner to read kb input accessing to Student Class.
class Student{
private int sno;
private String  sname;
private String course;
private double fee;
private long mobile;
private char gender;
private boolean courseCompleted;

public void setsno(int sno){
	 this.sno=sno;
}
public void getsno(){
return ;	
}
public void setsno(String sname){
	 this.sname=sname;
}
public void getsname(){
return ;	
}
public void setcourse(String course){
	 this.course=course;
}
public void getcourse(){
return ;	
}

public void setfee(double fee){
	 this.fee=fee;
}
public void getfee(){
return ;	
}
public void setmobile(long mobile){
	 this.mobile=mobile;
}
public void getmobile(){
return ;	
}

public void setgender(char gender){
	 this.gender=gender;
}
public void getgender(){
return ;	
}
public void setcourseCompleted(boolean courseCompleted){
	 this.courseCompleted=courseCompleted;
}
public void getcourseCompleted(){
return ;	
}
@Override
public String toString(){
	return	"sno\t\t\t: " + sno + "\n"+ 
					"   sname\t\t: " + sname + "\n" +    
					"   course\t\t: " + course + "\n" +    
					"   fee\t\t\t: " + fee + "\n" +        
					"   mobile\t\t: " + mobile + "\n" +    
					"   gender\t\t: " + gender + "\n" +    
					"   courseCompleted\t: " + (courseCompleted?"completed":"not completed");
}
}
