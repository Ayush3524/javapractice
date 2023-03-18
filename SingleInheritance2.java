//Multiple Inheritance
import java.util.Scanner;
class Parent{
	public void add(int a,int b){
		System.out.println("The Addition is "+(a+b));
	}
}
class Child1 extends Parent{
	public void sub(int a,int b){
		System.out.println("The Subtraction is "+(a-b));
	}
}
class Child2 extends Child1{
	public void mul(int a,int b){
		System.out.println("The Multiplication is "+(a*b));
	}
}
class Child3 extends Child2{
	public void div(int a,int b){
		System.out.println("The Division is "+(a/b));
	}
}
class MultipleInheritance{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Numbers: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	Child3 c=new Child3();
	c.add(a,b);
	c.sub(a,b);
	c.mul(a,b);
	c.div(a,b);
	}
}