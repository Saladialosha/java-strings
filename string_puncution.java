import java.io.*;
import java.util.*;
class AAA
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	String n=in.nextLine();
	int count=0;
	for(int i=0; i<n.length();i++)
	{
		//if(n.charAt(i)=='!' || n.charAt(i)==',' || n.charAt(i)==';' || n.charAt(i)=='-' || n.charAt(i)=='?' || n.charAt(i)=='|' || n.charAt(i)=='\\' || n.charAt(i)==':')
			if(n.charAt(i)<48 && n.charAt(i)>32)
		{
			count++;
		}
	}
	System.out.print(count);
}	

}