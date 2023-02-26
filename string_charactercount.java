import java.io.*;
import java.util.*;
class AAA
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	String n=in.nextLine();
	int count=0;
	for(int i=n.length()-1;i>=0;i--)
	{
		n.charAt(i);
		if(n.charAt(i)==' ')
		{
            continue; 
		}
		else
		{
			count++;
		}
		
	}
System.out.print(count);
}	
}