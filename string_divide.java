import java.io.*;
import java.util.*;
class AAA
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	String n=in.nextLine();
	int k=in.nextInt();
	if(n.length()%k !=0)
	{
		System.out.print("invalid");
	}
	else
	{
		int x=n.length()/k;
		for(int i=0; i<n.length();i++)
		{
			if(i%x==0)
				System.out.println();
			System.out.print(n.charAt(i));
		}
	}


	
}}