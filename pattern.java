class Pattern
{
  public static void main(String abc[])
  {
	  int k=6;
	  
   for(int i=1;i<4;i++)
   {
	   int alpha=97;
	    
      for(int j=0; j<k;j++) 
	  {		  
         System.out.print(" ");  
	  }		 
	  k=k-1;
      for(int j=1;j<=i;j++)
       {
         System.out.print(" "+(char)alpha);
         alpha++;
       }
	 
      System.out.println(" ");
   }
 
  }
}