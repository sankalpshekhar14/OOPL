import MyComplexNumber.Complex;
import MyComplexNumber.ZeroAbsoluteValueException;
import java.util.*;

 

public class ComplexDemo{
	public static void main(String[] args) {
		Complex a=new Complex();
		a.initialize(0,0);
		a.display();
		double f;
		try{
			f=a.absoluteOfComplex();

		}
		catch(ZeroAbsoluteValueException e){
			System.out.println(e);
		}
	}
}