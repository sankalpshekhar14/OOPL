import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Prime{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		//Input values
		System.out.println("Enter n>>");
		int n=sc.nextInt();
		System.out.println("First prime numbers till "+n+ " are: ");
		int i=2;

		if(n==1)
			System.out.println("1 is not a prime number");

		for(i=2;i<=n;i++){
			if(isPrime(i)==1)
				System.out.println(i);

		}

	}
	public static int isPrime(int n){
		int i=2;
		int flag=1;
		for(i=2;i<n/2;i++){
			if(n%i==0)
				{flag=0;
					break;
				}

		}
	
		if (flag==1)
			return 1;
		else 
			return 0;


	}
}