//octal digits escape charaters
//\0 to \7 print octal below
class Octal{
public static void main(String[] args){
System.out.println("a\0b");//anullb
System.out.println("a\1b");//a(light smile)b
System.out.println("a\2b");//a(fill smile)b
System.out.println("a\3b");//a(fill heart)b
System.out.println("a\4b");//a(fill diamond)b
System.out.println("a\5b");//a(fill clubs)b
System.out.println("a\6b");//a(fill spades)b
System.out.println("a\7b");//ab
//System.out.println("a\8b");//error not avalible
//System.out.println("a\9b");//error not avalible
System.out.println("a\10b");//b
System.out.println("axyz\10\10b");//axbz
System.out.println("axyz\16565000\1033kklkb");//axyzu65000C3kklkb
System.out.println("ax\10000\10001by/n/n");//ax@00@01by

System.out.println("anand\00vyshu");//
System.out.println("anand\000vyshu");
System.out.println("anand\0000vyshu");
System.out.println("anand\00000vyshu");
System.out.println("anand\000000vyshu");
System.out.println("anand\0000000vyshu");
System.out.println("anand\00000000vyshu");
System.out.println("anand\000000000vyshu");
System.out.println("anand\0000000000vyshu/n");

System.out.println("anand\1001vyshu");
System.out.println("anand\10002vyshu");
System.out.println("anand\100003vyshu");
System.out.println("anand\1000004vyshu");
System.out.println("anand\10000005vyshu");
System.out.println("anand\100000006vyshu");
System.out.println("anand\1000000007vyshu");
System.out.println("anand\1000000000vyshu");
System.out.println("anand\301010100vyshu\n");

System.out.println("anand\2011vyshu");
System.out.println("anand\5002vyshu");
System.out.println("anand\4003vyshu");
System.out.println("anand\5004vyshu");
System.out.println("anand\005vyshu");
System.out.println("anand\40\06vyshu");
System.out.println("anand\10\07vyshu");
System.out.println("anand\400\0vyshu");
System.out.println("anand\10\10\10vyshu");

System.out.println("anand\33vyshu");//anand(leftarrowsymbol)vyshu
System.out.println("anand\333vyshu");
System.out.println("anand\3333vyshu");
System.out.println("anand\33333vyshu");
System.out.println("anand\333333vyshu");
System.out.println("anand\3333333vyshu");
System.out.println("anand\33333333vyshu");
System.out.println("anand\333333333vyshu");
System.out.println("anand\3333333333vyshu");

}
}