import java.io.*;
import java.util.Scanner;
import java.lang.Math;

 class Counter{
	static int count=0;
	Counter(){
		count++;
	}
	public static void showCount(){
			System.out.println(count);
	}
}
public class Counter_test{
	public static void main(String[]args){ Counter c1=new Counter();
		Counter c2=new Counter();
		Counter.showCount();

	}
} 
