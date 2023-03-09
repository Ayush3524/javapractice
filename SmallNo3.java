import java.util.Scanner;
class LpYr{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the year: ");
		int yr=sc.nextInt();
		  if (yr%4==0) {
		  	  System.out.print(yr+" is leap year");
		  }else {
		  	  System.out.print(yr+" is not a leap year");
		  }
	}
}