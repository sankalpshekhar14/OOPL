import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Bubble{
	public static void main(String[]args){

		//Declaring variables
		int n,i,flag;
		flag=1;


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

		//Input selection for ascending/descending order
		System.out.println("Enter A for Ascending and D for descending order");
		char ch=sc.next().charAt(0);

		switch(ch){

			case 'A':
				bubbleSort(a,1);
				break;
			case 'D':
				bubbleSort(a,0);
				break;
			default:
				System.out.println("Wrong choice");
				flag=0;
		}
		if(flag!=0){
			//Print the sorted array
			System.out.println("The Sorted array is");
			for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}

	}
}
	public static void bubbleSort(int a[],int x){
		
		int temp,i,j;
		for(i=0;i<a.length-1;i++){
			for(j=0;j<a.length-i-1;j++){

				if(x==1){
				if(a[j]>a[j+1]){

					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
				else if(x==0){
					if(a[j]<a[j+1]){

					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}

			}
				}

		}
	}
}