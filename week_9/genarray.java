import java.io.*;
import java.util.*;
import java.lang.*;

class Gen<T>{
	T arr;

		Gen(int n){
			T arr=new T[n];

		}
		void swap(int index, int index2){
			T temp=arr[index];
			arr[index]=arr[index2];
			arr[index2]=temp;
		}

}

public class genarray{
	public static void main(String[] args) {
		Gen<Integer> a=new Gen<Integer>(3);
		a.arr[1]=1;
		a.arr[0]=0;
		a.arr[2]=3;
		a.swap(0,2);
		for(int i=0;i<3;i++){
			System.out.println(a.arr[i]);
		}

	}
}