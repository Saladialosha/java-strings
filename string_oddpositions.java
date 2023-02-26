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
		for(int i=0; i<s.length();i++)
		{
			if(i%2!=0)
			{
				System.out.print("position of" +i+ " " + "char is " + s.charAt(i));
			}
		}
	}
}
