import java.io.*;
import java.util.Scanner;

class Phone{
	String brand;
	int memCapacity;

	  interface Callable{
	 	void makeAudioCall(String cellNum);
	 	void makeVideoCall(String cellNum);
	 }
}
class BasicPhone implements Phone.Callable{
	public void makeAudioCall(String cellNum){
		System.out.println("Call made");
	}
	public void makeVideoCall(String cellNum){
		System.out.println("Call Not made");
	}
}

class SmartPhone implements Phone.Callable{
	public void makeAudioCall(String cellNum){
		System.out.println("Call made");
	}
	public void makeVideoCall(String cellNum){
		System.out.println("Call made");
	}	
}

public class phone_test{
	public static void main(String[] args) {
		
	
		BasicPhone ph=new BasicPhone();
		SmartPhone ph2=new SmartPhone();
		String s=new String("BSDK");
		ph.makeAudioCall(s);
		ph2.makeVideoCall(s);
}
}