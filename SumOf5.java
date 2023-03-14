import java.util.Scanner;
class SumOf5{
	public static void main(String[] args) {
		int sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Numbers: ");
		for (int i=1;i<=5 ;i++ ) {
			n=sc.nextInt();
			sum=sum+n;
		}
		double avg=sum/5.0;
		System.out.println("The Sum Of 5 Numbers is: "+sum);
		System.out.println("The Average is: "+avg);
	}
}