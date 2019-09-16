import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Quadratic{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a,b,c for a quadratic equation");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		find_roots(a,b,c);
		
	}

	public static void find_roots(int a, int b, int c){

		int d=b*b-4*a*c;
		int flag=0;

		if(d<0)
			flag=-1;
		else if(d>0)
			flag=1;

		switch(flag){

			case 0:
				float r=(float)-b/2*a;
				System.out.println("Roots are equal and equal to "+r);
				break;
			
			
			case 1:float r1=(float)(-b+Math.sqrt(d))/2*a;
					float r2=(float)(-b-Math.sqrt(d))/2*a;
					System.out.println("Roots are distinct and equal to "+r1+","+r2);
					break;
					
			case -1:System.out.println("Roots are imaginary");



			



	}



}

}