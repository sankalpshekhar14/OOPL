import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class Mixer{
	int []a;
	public void accept(){
		Scanner sc =new Scanner(System.in);
		int n=this.a.length;
		for (int i=0;i<n;i++)
			this.a[i]=sc.nextInt();

	}
	public Mixer mix(Mixer A){
		int j=0;
		int n=this.ar.length+A.ar.length;
		Mixer c=new Mixer();
		int c.a=new int[n];
		for(int i=0;i<n;i++){
			if(i<this.a.lenth)
			c.a[i]=this.a[i];
			else 
			c.a[i]=A.a[j++];
	}
		bubbleSort(c.a);
		return c;


	}
	public void display(){
		for (int i=0;i<this.a.length;i++)
			System.out.println(this.a[i]);
	}

public static void bubbleSort(int a[]){
		
		int temp,i,j;
		for(i=0;i<a.length-1;i++){
			for(j=0;j<a.length-i-1;j++){

				if(a[j]>a[j+1]){

					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
				
		}
	}

}
public class Mix_test{

		public static void main(String[] args) {
			Mixer M1=new Mixer();
			Mixer M2=new Mixer();
			Mixer M3=new Mixer();
			Scanner sc=new Scanner();
			n1=sc.nextInt();
			n2=sc.nextInt();
			int M1.a=new int[n1];
			int M2.a=new int[n2];
			M1.accept();
			M2.accept();
			M3=M1.mix(M2);
			M3.display();


		}
}



