import java.io.*;
import java.util.*;
import java.lang.Math;

public class Convt_test{
	public static void main(String[]args){
		String a=new String();
		String str=new String();
		String str2=new String();
		Scanner sc= new Scanner(System.in);
		a=sc.next();
		int l=a.length();
		int i=0;
		while(i<l){
			if(i==0){
			int n=l%3;
			if(n!=0){
				str=a.substring(0,n);
				i=n-1;
			}
			else{
				str=a.substring(0,3);
				i=2;
			}
			str2=str.concat(",");
		}
			
		i=i+3;
		if(i<l)
		{str=a.substring(i-2,i+1);

		str2=str2.concat(str);
		if(i+3<l)
		str2=str2.concat(",");


		}

		System.out.println(str2);



	}
}
}