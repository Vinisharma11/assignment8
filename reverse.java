import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String d= sc.nextLine();
		
		char []xd=d.toCharArray();
		int len= xd.length;
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(xd[i]);
		}
	}
}