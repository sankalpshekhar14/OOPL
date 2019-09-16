import java.io.*;
import java.util.*;
import java.lang.Math;
//Student class definiton
class Student{
	int regno;
	String Name;
	GregorianCalendar join_date;
	short sem;
	double GPA;
	double CGPA;
	int num;
	static int student_count;

	Student(){
		Name="Untitled";
		join_date=new GregorianCalendar(0,0,0);
		sem=0;
		GPA=0.0;
		CGPA=0.0;
		 num=++student_count;
	}
	Student(String b,GregorianCalendar c,short d,double e,double f){
		Name=b;
		join_date=c;
		sem=d;
		GPA=e;
		CGPA=f;
		num=++student_count;
		getRegno();
	}
	void display(){
		System.out.println("Name: "+this.Name);
		System.out.println("Registration Number:"+this.regno);
		System.out.println("Date of joining:"+join_date.get(Calendar.DATE)+'/'+join_date.get(Calendar.MONTH)+1+'/'+join_date.get(Calendar.YEAR));
		System.out.println("Semester:"+this.sem);
		System.out.println("GPA:"+this.GPA);
		System.out.println("CGPA:"+this.CGPA);
	}
	void getRegno(){
		int i;
		i=join_date.get(Calendar.YEAR);
		i=i%2000;
		String str=Integer.toString(i);
		String str2=Integer.toString(num);
		String str3=str.concat(str2);
		regno=Integer.parseInt(str3);		
	}


}
public class Student_test{
	public static void main(String[]args){Scanner sc=new Scanner(System.in);
	String s;
	GregorianCalendar b;
	short d;
	double f;
	double g;	
		Student a[]=new Student[5];
		for(int i=0;i<4;i++){
			s=sc.next();
			d=sc.nextShort();
			int date=sc.nextInt();
			f=sc.nextDouble();
			g=f;
			GregorianCalendar greg=new GregorianCalendar(date,date,date);
			a[i]=new Student(s,greg,d,f,g);

		}
		for(int i=0;i<4;i++){
			a[i].display();
		}


	}

}