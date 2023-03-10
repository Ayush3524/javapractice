import java.util.Scanner;
class MulDig{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int no=sc.nextInt();
		int mul=1,rem;
		  while (no>0) {
		  	 rem=no%10;
             mul=mul*rem;
             no=no/10;
		  }
	System.out.print("The Multiplication is "+mul);
	}
}