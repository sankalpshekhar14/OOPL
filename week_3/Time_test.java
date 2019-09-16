import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class Time{
	int hr;
	int min;
	int sec;

	Time(){
		hr=0;
		min=0;
		sec=0;
	}
	Time(int a, int b, int c){
		hr=a;
		min=b;
		sec=c;

	}
	public void setTime(int a,int b,int c){
		if(a<24)
			this.hr=a;
		else 
			this.hr=a%24;
		if(b<60)
			this.min=b;
		else 
			{this.min=b%60;
			 this.hr+=b/60;
			}
		if(c<60)
			this.sec=c;
		else 
			{this.sec=b%60;
			 this.min+=b/60;
			 this.hr+=this.min/60;
			}



	}
	public void showTime(){
		System.out.println(this.hr+":"+this.min+":"+this.sec);

	}
	public Time addTime(Time t){
		Time sum=new Time();
		sum.hr=this.hr+t.hr;
		sum.min=this.min+t.min;
		sum.sec=this.sec+t.sec;
		sum.setTime(sum.hr,sum.min,sum.sec);

	 	return sum;

	}
	public Time subTime(Time c){
		Time diff=new Time();
		diff.hr=Math.abs(this.hr-c.hr);
		diff.min=Math.abs(this.min-c.min);
		diff.sec=Math.abs(this.sec-c.sec);
		diff.setTime(diff.hr,diff.min,diff.sec);
		return diff;
	}
	public int compTime(Time t){
		if(t.hr<this.hr)
			return 1;
		else if (t.hr>this.hr)
			return 0;
		else 
			if(t.min<this.min)
				return 1;
			else if(t.min>this.min)
				return 0;
		else 
			if(t.sec<this.sec)
				return 1;
			else if(t.min>this.min)
				return 0;
		else 
			return -1;
	}


}
class Time_test{
	 public static void main(String[] args) {	
	 	Time t1=new Time();
	 	Time t2=new Time();
	 	Time t3=new Time();
	 	t1.setTime(1,55,20);
	 	t2.setTime(2,20,10);
	 	t3=t1.addTime(t2);
	 	t3.showTime();

		
	}
}