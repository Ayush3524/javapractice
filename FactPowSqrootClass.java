import java.util.Scanner;
class Operation{
	int res1=0;
	double res2;
	public int fact(int no){
		int fact=1;
		for (int i=1;i<=no;--no) {
			fact=fact*no;
		}
		return fact;
	}
	public int pov(int no,int p){
		res1=1;
		for (int i=0;i<p ;++i ) {
			res1=res1*no;
		}
		return res1;
	}
	public double sqroot(double num){
		double res2=Math.pow(num,0.5);
		return res2;
	}
}

class FactPowSqrootClass{
	public static void main(String[] args) {
		int res=0;
		double res2;
		Scanner sc=new Scanner(System.in);
		Operation obj=new Operation();
		System.out.println("Enter The Choice: ");
		System.out.println("1.Factorial\n2.Power\n3.Square Root");
		int n=sc.nextInt();
		switch(n){
		case 1:
			System.out.println("Enter any Number: ");
			int no=sc.nextInt();
			res=obj.fact(no);
			System.out.println("The Result is: "+res);
			break;
		case 2:
			System.out.println("Enter any Number: ");
			no=sc.nextInt();
			System.out.println("Enter The Power Number: ");
			int p=sc.nextInt();
			res=obj.pov(no,p);
			System.out.println("The Result is: "+res);
			break;
		case 3:
			System.out.println("Enter any Number: ");
			double num=sc.nextDouble();
			res2=obj.sqroot(num);
			System.out.println("The Result is: "+res2);
			break;
		default :
			System.out.println("Wrong Choice...");
			break;
		}
	}
}