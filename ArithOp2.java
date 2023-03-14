import java.util.Scanner;
class ArithOp2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int res;
		float div;
		System.out.print("Enter Two Numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("Enter The Choice: ");
		System.out.println("\n+.Addition\n-.Subtraction\n*.Multiplication\n/.Division");
		char ch=sc.next().charAt(0);
		 switch(ch){
		 case '+':
		 	res=a+b;
		 	System.out.print("The Addition is "+res);
		 	break;
		 case '-':
		 	res=a-b;
		 	System.out.print("The Subraction is "+res);
		 	break;
		 case '*':
		 	res=a*b;
		 	System.out.print("The Multiplication is "+res);
		 	break;
		 case '/':
		 	div=a/b;
		 	System.out.print("The Division is "+div);
		 	break;
		 }
	}
}