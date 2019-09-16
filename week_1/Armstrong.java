import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Armstrong{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		//Input values
		System.out.println("Enter n>>");
		int n=sc.nextInt();
		isArmstrong(n);
	}

	public static void isArmstrong(int n){
		int sum=0;
		int u=0;
		while(n!=0){
			u=n%10;
			sum=sum+(u*u*u);
			n=n/10;
		}
	System.out.println(sum)
	if(n==sum)
		System.out.println("Armstrong");
	else
		System.out.println("Not Armstrong");



	}
}
