import java.util.*;
class vowel{

   public static void main(String args[]) 
   {  Scanner sc = new Scanner(System.in);
      System.out.println("enter a string");
      String sb = sc.nextLine();
	  char []a = sb.toCharArray();
	  int len = a.length;
	  for(int i=0; i<len;i++)
	  {
	  if(a[i]=='a'||a[i]=='i'||a[i]=='e'||a[i]=='o'||a[i]=='u')
	  {
		  a[i]=' ';
	  }
	  }
      System.out.println(a); 
   }  
}