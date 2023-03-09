import java.util.Scanner;
class PrMrks{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Paper Marks: ");
		int m1=sc.nextInt();
		System.out.print("Enter 2nd Paper Marks: ");
		int m2=sc.nextInt();
		System.out.print("Enter 3rd Paper Marks: ");
		int m3=sc.nextInt();
		  if (m1<45 || m2<45 || m3<45) {
		  	    System.out.print("You are fail");
		  }
		  else {
		  	  System.out.print("You are pass");
		  }
	}
}