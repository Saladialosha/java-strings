
//tocharArray()->converting string into char arry
import java.io.*;
import java.util.*;
class AA
{
	public static void main(String[] args)
	{ 
		String S="India";
		char c[]=S.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>=65 && c[i]<=90)
			{
				c[i]+=32;
				
			}
			System.out.print(c[i]);
		}
		
	}
	
}