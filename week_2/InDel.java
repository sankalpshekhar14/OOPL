import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class InDel{
	public static void main(String[]args){

		//Declaring variables
		int n,i,flag;
		flag=-2;


		Scanner sc=new Scanner(System.in);
		//Input size
		System.out.println("Enter size of array(max 80)>>");
		n=sc.nextInt();
		
		//Dynamic Allocation
		int[]a=new int[80];

		//Input Elements
		for(i=0;i<n;i++){
			System.out.println("Enter element for "+(i+1)+" position");
			a[i]=sc.nextInt();
		}
		//Selecting the option for Insertion/Deletion
		System.out.println("Enter I for Insertion and D for Deletion");
		char ch=sc.next().charAt(0);

		switch(ch){

			case 'I':
				//Input element to be inserted and its position
				System.out.println("Enter the element to be inserted and the position");
				int k=sc.nextInt();
				int pos=sc.nextInt();

				//Insertion function called
				Insertion(a,n,k,pos);
				flag=0;
				break;

			case 'D':
				//Input element to be deleted and its position
				System.out.println("Enter the element to be deleted and the position");
				 k=sc.nextInt();
				 pos=sc.nextInt();

				//Deletion function called
				Deletion(a,n,k,pos);
				flag=-1;
				break;
			default:
				System.out.println("Wrong choice");
				flag=1;
		}


			if(flag==0){
				System.out.println("Array after insertion is");

				for(i=0;i<=n;i++){
					System.out.println(a[i]);
				}
			}
			else if(flag==-1){
				System.out.println("Array after deletion is\n");

				for(i=0;i<n-1;i++){
					System.out.println(a[i]);
				}
			}
	}


public static void Insertion(int a[],int n,int k,int pos){
	int i;
	for(i=n;i>=pos;i--){
		a[i]=a[i-1];

	}
	a[pos-1]=k;
	n=n+1;
}

public static void Deletion(int a[],int n,int k,int pos){
	int i;
	for(i=pos;i<n;i++){
		a[i-1]=a[i];

	}
	n=n-1;
	
}
}