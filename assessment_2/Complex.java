package MyComplexNumber;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Complex{
					int real;
					int imag;
				public void initialize(int a,int b){
					real=a;
					imag=b;
				}
				public void display(){
					System.out.println(real+"+i"+imag);
				}
				public double absoluteOfComplex() throws ZeroAbsoluteValueException{
					double f=Math.sqrt(real*real+imag*imag);
					
					if(f==0)
						throw new ZeroAbsoluteValueException();

					return f;

				}	




}

