import java.io.*;
import java.util.*;
//string functions.
//charAt() to find out all the char at the odd positions
//
class AA
{
	public static void main(String[] args)
	{ 
		String s="HELLO";
		int count=0;
		int n=s.length();
		for(int i=0; i<n;i++)
		{
			if(s.charAt(i)=='T')
				count++;
			
				
		}
		System.out.println(count);
	}
	
}
