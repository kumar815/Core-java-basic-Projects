//octal digits escape charaters
//\0 to \7 print octal below
class Octal{
public static void main(String[] args){
System.out.println("a\0b");
System.out.println("a\1b");
System.out.println("a\2b");
System.out.println("a\3b");
System.out.println("a\4b");
System.out.println("a\5b");
System.out.println("a\6b");
System.out.println("a\7b");
//System.out.println("a\8b");//error not avalible
//System.out.println("a\9b");//error not avalible
System.out.println("a\10b");
}
}