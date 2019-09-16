import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class AddMat{
	public static void main(String[]args){

		//Declaring variables
		int m,n,i,j;


		Scanner sc=new Scanner(System.in);
		//Input size
		System.out.println("Enter dimensions of matrices>>\n");
		m=sc.nextInt();
		n=sc.nextInt();
		
		//Dynamic Allocation
		int[][]a=new int[m][n];
		int[][]b=new int[m][n];
		int[][]result=new int[m][n];

		//Input Elements of first matrix
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.println("Enter element for ("+i+","+j+") position\n");
				a[i][j]=sc.nextInt();
			}
		}
		//Input Elements of second matrix
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.println("Enter element for ("+i+","+j+") position\n");
				b[i][j]=sc.nextInt();
			}
		}

		//Call Compute Sum function
		result=computeSum(a,b,m,n);

		//Display result
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print(result[i][j]+" ");

		}
		System.out.println();

	}
}

	public static int[][]computeSum(int a[][],int b[][],int m,int n){
		int[][]c=new int[m][n];

		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}