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
		//mutable strings
		StringBuilder s1=new StringBuilder("LPU");
		s1.append("STUDENTS");
		System.out.println(s1);//LPUSTUDENTS 
		
		//insert function
		s1.insert(2,"CSE");
		System.out.println(s1);
		 
		//replace function
		s1.replace(2,4,"ECE");
		System.out.println(s1);//LPECEUSTUDENTS
		
		//delete function
		s1.delete(2,5); //deteles from 2 to 4
		System.out.println(s1);   //LPUSTUDENTS
		
		//reverse 
		s1.reverse();
		System.out.println(s1);
		

}	
}