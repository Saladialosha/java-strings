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
		for(int i=0; i<s.length();i+=2)
		{
			System.out.print(s.charAt(i));
		}
	}
}
