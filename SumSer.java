import java.util.Scanner;
import java.lang.Math;
class SumSer{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		int x=sc.nextInt();
	        double sum=1;
		 for (int i=1;i<=x ;i++) {
		 	sum=sum+(Math.pow(x,i)/i);
		 }
		System.out.print("The Sum Of Series is "+sum);
	}
}
