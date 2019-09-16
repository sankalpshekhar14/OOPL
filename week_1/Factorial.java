import java.io.*;
import java.util.Scanner;

public class Factorial{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		//Input values
		System.out.println("Enter n,r>>");
		int n=sc.nextInt();
		int r=sc.nextInt();
		//Find nCr by calling fact method
		float nCr=(float)fact(n)/(fact(n-r)*fact(r));
		System.out.println(n+"C"+r +" is "+nCr);
	}

	public static int fact(int n){
		int i=1;
		int f=1;
		for (i=1;i<=n ;i++ ) {
			f=f*i;
			
		}
	
		return f;


	}





}