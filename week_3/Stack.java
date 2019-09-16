import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class Stack{
	int []a=new int[80];
	int top;

	Stack(){
		top=-1;
	}
	public void stackInit(){
		this.top=-1;
	}
	public void push(int element){
		if(this.top==79)
			{System.out.println("Stack Overflow");
				return;
			}
		this.top++;
		this.a[this.top]=element;

	}
	public int pop(){
		if(top==-1)
			{System.out.println("Stack Underflow");
			 return;
			}

		return this.a[(this.top)--];
	}
	public void display(){
		for(int i=0;i<=this.top;i++){
			System.out.println(this.a[i]);

		}
	}
	
}