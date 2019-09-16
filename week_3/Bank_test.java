import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class Bank_Account{
	int Acc;
	String name;
	char acc_type;
	double amount;
	static int roi=7;
	Bank_Account(){
		Acc=0;
		name="UNTITLED";
		amount=0.0;
		acc_type='S';


	}
	Bank_Account(int a, double b,String c,char d){
		Acc=a;
		name=c;
		amount=b;
		acc_type=d;
	}
	public void deposit(double n){
		this.amount+=n;
	}
	public void withdraw(double n){
		if(this.amount-n<0)
			System.out.println("Insufficient Balance");
		else 
			this.amount-=n;
		}
	public void details(){
		System.out.println("Name:"+this.name);
		System.out.println("AccNo.:"+this.Acc);
		System.out.println("Acc Type:"+this.acc_type);
		System.out.println("Balance:"+this.amount);
		disp_roi();
		//System.out.println("ROI:"+Bank_Account.disp_roi());

	}
	public static void disp_roi(){
		System.out.println("ROI:"+roi);
	} 
	
}
public class Bank_test{
	public static void main(String[] args) {
		Bank_Account A1=new Bank_Account();
		Bank_Account A2=new Bank_Account(12345,50.0,"Sankalp",'S');
		A2.deposit(100);
		A2.withdraw(20);
		A2.details();

	}
}