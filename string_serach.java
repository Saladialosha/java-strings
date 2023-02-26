//searching the string (indexof())
import java.io.*;
import java.util.*;
class AAA
{
	public static void main(String[] args)
	{ 
		String S="now it is time";
		System.out.println(S);//now it is time
		System.out.println("last index of t" + S.indexOf('t'));//5
		System.out.println("last index of t" + S.lastIndexOf('t'));//10
		System.out.println("last index of t" + S.indexOf("it"));//4
		System.out.println("last index of t" + S.indexOf('t',3));//10


}}