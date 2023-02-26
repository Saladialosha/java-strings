//modification of string
//substring(start_index)   ->priont substring from start index  to end index
//(end_index start_index) ->print substring accordingly
//and replace
import java.io.*;
import java.util.*;
class AAA
{
	public static void main(String[] args)
	{ 
		String S="now it is time";
		String t=S.substring(2);
		System.out.println(t);//w it is time
		String w=S.substring(2,5);//printed from 2 index to(5-1) index
		System.out.println(w);//w i
		String k=S.replace('t','w');
		System.out.println(k);
		
		
		


}}