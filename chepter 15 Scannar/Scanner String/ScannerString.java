//Scanner import 
//Scanner is a read the key board values
//use to charAt meens Getter method 

import java.util.Scanner;
class ReadingChar{
public static void main(String[] args){
Scanner scn = new Scanner(System.in);
System.out.println("Enter your Characters");
String str = scn.next();
char ch = str.charAt(0);
System.out.println("\n characters result:"+ch);

}
}