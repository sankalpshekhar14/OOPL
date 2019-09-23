import java.io.*;
import java.util.*;

class Table{

	void printTable(int n){
		for(int i=1;i<=10;i++)
			System.out.println(n+"*"+i+"="+n*i);
	}
}

class Multi5 extends Thread{
	Table t1;

	Multi5(Table t){
		t1=t;
	}

	public void run(){
		t1.printTable(5);
	}
}

class Multi7 extends Thread{
	Table t1;

	Multi7(Table t){
		t1=t;
	}

	public void run(){
		t1.printTable(7);
	}
}

public class MultiTable{
	public static void main(String[] args) {
		Table t1=new Table();
		Multi5 obj1=new Multi5(t1);
		Multi7 obj2=new Multi7(t1);
		obj1.start();
		obj2.start();
	}
}