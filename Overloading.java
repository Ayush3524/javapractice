//Method Overloading
import java.util.Scanner;
class Test{
	void add(int a,int b){
		System.out.println("The Addition of a="+a+" and b="+b+" is "+(a+b));
	}
	void add(int a,int b,int c){
		System.out.println("The Addition of a="+a+" b="+b+" c="+c+" is "+(a+b+c));
	}
	void add(int a,int b,int c,int d){
		System.out.println("The Addition of a="+a+" b="+b+" c="+c+" d="+d+" is "+(a+b+c+d));
	}
}
class Overloading{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Four Numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		Test t=new Test();
		t.add(a,b);
		t.add(a,b,c);
		t.add(a,b,c,d);
	}
}