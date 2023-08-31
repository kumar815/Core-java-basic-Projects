//Slashb.java(left side charor a word is replaced with rightside char)
class Slashb{
public static void main(String[] args){
System.out.println("abcdef\b");//abcdef
System.out.println("abcde\bf");//abcdf
System.out.println("abcd\bef");//abcef
System.out.println("abc\bdef");//abdef
System.out.println("ab\bcdef");//acdef
System.out.println("a\bbcdef");//bcdef
System.out.println("\babcdef\n\n");//abcdef

System.out.println("abcdef\b\b");//abcdef
System.out.println("abcde\b\bf");//abcfe
System.out.println("abcd\b\bef");//abef
System.out.println("abc\b\bdef");//adef
System.out.println("ab\b\bcdef");//cdef
System.out.println("a\b\bbcdef");//bcdef
System.out.println("\b\babcdef");//abcdef
} 
}