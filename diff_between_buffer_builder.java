
//difference between string buffer and string builder

import java.io.*;
import java.util.*;
class AAA
{
	public static void main(String[] args)
	{
	long st=System.currentTimeMillis();  //st=start time; 
	StringBuffer s1=new StringBuffer("JAVA");
	for(int i=0;i<1000000; i++)
	{
		s1.append("LPU");
	}
	System.out.println("time taken=" + (System.currentTimeMillis()-st));
	st=System.currentTimeMillis();  //st=start time
	StringBuffer s2=new StringBuffer("JAVA");
	for(int i=0;i<1000000; i++)
	{
		s2.append("LPU");
	}
	System.out.println("time taken="+ (System.currentTimeMillis()-st));
	
		
		

}	
}