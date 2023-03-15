import java.util.Scanner;
class Arithmatic{
	int res1=0;
	public int add(int a,int b){
		res1=a+b;
		return res1;
	}
	public int sub(int a,int b){
		res1=a-b;
		return res1;
	}
	public int mlt(int a,int b){
		res1=a*b;
		return res1;
	}
	public int div(int a,int b){
		res1=a/b;
		return res1;
	}
}

class ArithOpUsingClass{
	public static void main(String[] args) {
	int res=0;
	Scanner sc=new Scanner(System.in);
	Arithmatic obj=new Arithmatic();
	System.out.print("Enter Two Numbers: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Enter the Choice: ");
	System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
	int n=sc.nextInt();
	switch(n){
	case 1: 
		res=obj.add(a,b);
		break;
	case 2:
		res=obj.sub(a,b);
		break;
	case 3:
		res=obj.mlt(a,b);
		break;	
	case 4:
		res=obj.div(a,b);
		break;
	default:
		System.out.print("Wrong Choice.....");
	}
	System.out.print("The Result is: "+res);
	}
}