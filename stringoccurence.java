import java.util.Scanner;
class comparison {
Scanner s=new Scanner(System.in);
System.out.println("enter first string");
	String s1=s.nextLine();
System.out.println("enter first string");
String s2=s.nextLine();
void check() {
	 if(s1.contains(s2)==true) {
		  System.out.println("String2 contains in String1");
	 }else {
		  System.out.println("String2 doesn't contain in String1");
	 }
}
	public static void main(String[] args) {

	comparison c=new comparison();
	c.check();
	}
}
