import java.util.Scanner;
class LargeEqual{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		int b=sc.nextInt();
		System.out.print("Enter 3rd Number: ");
		int c=sc.nextInt();
		int big=0;
	  		if (a>b) {
	  			if (a>c) {
	  				big=a;
	  			}else {
	  				big=c;
	  			}
	  		}
	  		if (b>a) {
	  			if (b>c) {
	  				big=b;
	  			}else {
	  				big=c;
	  			}
	  		}
	  		if (c>a) {
	  			if (c>b) {
	  				big=c;
	  			}else {
	  				big=b;
	  			}
	  		}
	  		if (a==b) {
	  			if (b==c) {
	  				big=c;
	  				System.out.println("The Numbers are Equal.");
	  			}
	  		}
	  		System.out.println("The Biggest Number is "+big);
	}
}