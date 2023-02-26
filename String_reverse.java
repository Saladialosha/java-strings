//string builder
//StringBuilder
//stringBuilder(String)
//StringBuilder(int capacity)
import java.io.*;
import java.util.*;
class AAA
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	String n=in.nextLine();
	
	for(int i=n.length()-1;i>=0;i--)
	{
		System.out.print(n.charAt(i));
	}

}	
}