import java.util.Scanner;
class RevNo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int no=sc.nextInt();
		int rev=0,rem;
		  while (no>0) {
		  	rem=no%10;
		  	rev=rev*10+rem;
		  	no=no/10;
		  }
	System.out.print("The Reverse Number is "+rev);
	}
}