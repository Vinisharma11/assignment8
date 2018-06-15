import java.util.Scanner;
class subs{

    public static void substr(String str, int n)
    {
       for (int i = 0; i < n; i++) 
           for (int j = i+1; j <= n; j++)
            
                System.out.println(str.substring(i, j));
    }
    public static void main(String[] args)
    {  
	  Scanner sc = new Scanner(System.in);
	     System.out.println("enter a string");
         String str = new String();
		 str = sc.nextLine();
        substr(str, str.length());
    }
}