
//getChar()->used to extract character from the string.
//getchar()->(int start_index, int end_index,char[], int offset)
import java.io.*;
import java.util.*;
class AAA
{
	public static void main(String[] args)
	{ 
		String S="India";
		char b[]=new char[10];
		b[0]='G';  b[1]='O'; b[2]='O'; b[3]='D';b[4]='K';
		S.getChars(0,5,b,4);
		System.out.println(b);
}}