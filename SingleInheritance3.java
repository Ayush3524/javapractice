//Hierarchy Inheritance
import java.util.Scanner;
class Parent{
	public void operation(int a,int b){
		System.out.println("The Addition is "+(a+b));
		System.out.println("The Subtraction is "+(a-b));
		System.out.println("The Multiplication is "+(a*b));
		System.out.println("The Division is "+(a/b));
	}
}
class Child1 extends Parent{
	public void show(){
		System.out.println("From Child1");
	}
}
class Child2 extends Parent{
	public void show1(){
		System.out.println("From Child2");
	}	
}
class Child3 extends Parent{
	public void show2(){
		System.out.println("From Child3");
	}
}
class HierarchyInheritance{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Numbers: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	Child1 c1=new Child1();
	Child2 c2=new Child2();
	Child3 c3=new Child3();
	c1.show();
	c1.operation(a,b);
	c2.show1();
	c2.operation(a,b);
	c3.show2();
	c3.operation(a,b);
	}
}