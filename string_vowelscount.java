import java.io.*;
import java.util.*;
class AAA
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	String n=in.nextLine();
	int count=0 , count1=0;
	for(int i=0; i<n.length();i++)
	{
		if(n.charAt(i)=='a' ||n.charAt(i)=='e'||n.charAt(i)=='i' || n.charAt(i)=='o' ||n.charAt(i)=='u' ||n.charAt(i)=='A' ||n.charAt(i)=='E' ||n.charAt(i)=='I' ||n.charAt(i)=='O' ||n.charAt(i)=='U')
		{
			count++;
		}
		else
		{
			count1++;
		}
		
	}
	System.out.println("The vowels are:"+count);
	System.out.println("The consonants are:"+count1);
}	

}