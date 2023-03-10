import java.util.Scanner;
class Fact{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int no=sc.nextInt();
		int fact=1,i=0;
		  while (i<no) {
             fact=fact*no;
             --no;
		  }
	System.out.print("The factorial is "+fact);
	}
}