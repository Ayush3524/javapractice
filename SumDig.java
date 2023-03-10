import java.util.Scanner;
class SumDig{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int no=sc.nextInt();
		int sum=0,rem;
		  while (no>0) {
		  	 rem=no%10;
                         sum=sum+rem;
                         no=no/10;
		  }
	System.out.print("The Sun of Digits is "+sum);
	}
}
