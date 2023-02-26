//compareto()
//sorting the two strings
import java.io.*;
import java.util.*;
class AAA
{
	public static void main(String[] args)
	{ 
	    
		String S[]={"know" ,"hello", "we", "clg", "students", "for", "all"};
		for(int i=0;i<S.length;i++)
		{
			for(int j=i+1;j<S.length;j++)
			{
				if(S[j].compareTo(S[i])<0)
				{
				String t=S[i];
				S[i]=S[j];
				S[j]=t;
				}
				
			}
						System.out.println(S[i]);

}}}