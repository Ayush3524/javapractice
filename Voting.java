import java.util.Scanner;
class Voting{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int age=sc.nextInt();
		 if (age>=18) {
		 	System.out.print("You are Eligible for Voting.");
		 }else {
		 	System.out.print("You are Not Eligible for Voting.");
		 }
	}
}



