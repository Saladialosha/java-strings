//string buffer
//stringBuffer()
//stringBuffer(String)
//StringBuffer(int capacity)
import java.io.*;
import java.util.*;
class AAA
{
	public static void main(String[] args)
	{ 
		//String U="hello";
		//U.concat("student");
		//System.out.print(U);//hello
		
		//mutable strings

		StringBuffer s1=new StringBuffer("LPU");
		s1.append("STUDENTS");
		System.out.println(s1);
		//replace(start_index,end_index)
		s1.replace(1,3,"ECE");
		System.out.println(s1);//LECESTUDENTS
		
		//insert (start_index, charseq)
		s1.insert(2, "CSE");//
		System.out.println(s1);
		
		//delete(start_index, end_index)
		//delete char from start to end-1
		s1.delete(1,5); //character deleted from 1 to 4 position
		System.out.println(s1);//LCESTUDENTS
		
		//reverse
		s1.reverse();
		System.out.println(s1);//STNEDUTSECL

		
		//capacity -> 16characters
		StringBuffer s2=new StringBuffer();
		System.out.println(s2.capacity());  //16
		s2.append("LPU");
		
		s2.append("HELLO STUDENTS ITS JAVA CLASS, ITS RAINY DAY");
		System.out.println(s2.capacity()); //(oldcapacity*2)+2; //45 
		
		//ensureCapacity
		StringBuffer s3=new StringBuffer();
		s3.ensureCapacity(10);
		System.out.println(s2.capacity());  //10
		
}}