//Scanner import 
//Scanner is a read the key board values

import java.util.Scanner;
class Sanner{
public static void main(String[] args){
Scanner scn = new Scanner(System.in);
System.out.println("Enter Frist Number");
int a = scn.nextInt();
System.out.println("Enter Second Number");
int b = scn.nextInt();
int c = a+b;
System.out.println("\nc result is:"+c);

}
}