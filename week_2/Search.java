import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Search{
	public static void main(String[]args){

		//Declaring variables
		int n,i,flag;
		flag=0;


		Scanner sc=new Scanner(System.in);
		//Input size
		System.out.println("Enter size of array>>");
		n=sc.nextInt();
		
		//Dynamic Allocation
		int[]a=new int[n];

		//Input Elements
		for(i=0;i<n;i++){
			System.out.println("Enter element for "+(i+1)+" position");
			a[i]=sc.nextInt();
		}
		//Input the key
		System.out.println("Enter the element to be searched for");
		int b=sc.nextInt();

		//Linear Search
		for(i=0;i<n;i++){
			if(b==a[i])
				{flag=1; 
				 break;
				}
		}

		if(flag==1)
			System.out.println("Found at position "+(i+1));

		else
			System.out.println("Not Found");
	}	
	
}	 