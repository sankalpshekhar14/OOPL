import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class Complex{
	int real;
	int imag;

	Complex(){
		real=0;
		imag=0;
	}
	Complex(int a, int b){
		real=a;
		imag=b;
	}
	public void addData(int a, int b){
		this.real=a;
		this.imag=b;
	}
	public void displayData(){
		System.out.println(this.real+" + "+"i"+this.imag);
	}
	public Complex addComplex(Complex c){
		Complex sum= new Complex();
		sum.real=this.real+c.real;
		sum.imag=this.imag+c.imag;
		return sum;
	}
	public Complex subComplex(Complex c){
		Complex diff=new Complex();
		diff.real=Math.abs(this.real-c.real);
		diff.imag=Math.abs(this.imag-c.imag);
		return diff;
	}


}
public class Complex_Num{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Complex c1=new Complex();
		Complex c2=new Complex();
		Complex c3=new Complex();
		c1.addData(4,5);
		
		c2.addData(3,7);
		c3=c1.subComplex(c2);
		c3.displayData();

		
		}

	}
