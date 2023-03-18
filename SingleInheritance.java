//Single Inheritance
import java.util.Scanner;
class Parent{
	public void add(int a,int b){
		System.out.println("The Addition is "+(a+b));
	}
	public void sub(int a,int b){
		System.out.println("The Multiplication is "+(a-b));
	}
}
class Child extends Parent{
	public void mul(int a,int b){
		System.out.println("The Subtraction is "+(a*b));
	}
	public void div(int a,int b){
		System.out.println("The Division is "+(a/b));
	}
}
class SingleInheritance{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Numbers: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	Child c=new Child();
	c.add(a,b);
	c.sub(a,b);
	c.mul(a,b);
	c.div(a,b);
	}
}