package week1day1;

public class Calculator {

   public int add (int a,int b) {
	   int c=a+b;
	   return c;
   }
public void sub(int add,int b) {
	int s=add-b;{
		System.out.println(s);
	}
	
	}
public void multiply(int a, int b) {
	int m= a*b;{
		System.out.println(m);
	}
}
public void divide(double a,double b) {
	double d=a%b;{
		System.out.println(d);
	}
}
public static void main(String[] args) {
	Calculator cal=new Calculator();
	int add = cal.add(50,50);{
		System.out.println(add);
	}
	cal.sub(add, 33);
	cal.multiply(3,87);
  cal.divide(6642.4464,398.272737 );
}
}