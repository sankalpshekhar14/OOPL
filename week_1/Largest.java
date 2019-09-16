import java.io.*;
import java.util.Scanner;

public class Largest{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		//Input values
		System.out.println("Enter a,b,c>>");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//Check for largest by calling largest method
		largest(a,b,c);






	}

	public static void largest(int a, int b, int c){

		if(a>c&&a>b)
			System.out.println(a+" is the largest number");

		else if(b>c)
			System.out.println(b+" is the largest number");
		else 
			System.out.println(c+" is the largest number");			





	}







}

