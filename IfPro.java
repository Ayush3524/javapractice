import java.util.Scanner;

class IfPro{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int n=in.nextInt();
			if (n>0) {
				System.out.print(n+" is Positive");
			}
			if (n<0) {
				System.out.print(n+" is Negative");
			}
			else{
				System.out.print(n+" is Zero");
			}
	}
}