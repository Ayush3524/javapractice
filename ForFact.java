import java.util.Scanner;
class ForFact{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int no=sc.nextInt();
		int fact=1;
		for (int i=0;i<no;--no) {
			fact=fact*no;
		}
		System.out.print("The Factorial is "+fact);
	}
}