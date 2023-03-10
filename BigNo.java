import java.util.Scanner;
class BigNo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		int b=sc.nextInt();
		System.out.print("Enter 3rd Number: ");
		int c=sc.nextInt();
		System.out.print("Enter 4th Number: ");
		int d=sc.nextInt();
		System.out.print("Enter 5th Number: ");
		int e=sc.nextInt();
		int big=0;
			if (a>b) {
				if (a>c) {
					if (a>d) {
						if (a>e) {
							big=a;
						}else {
							big=e;
						}
					}
				}
			}
			if (b>a) {
				if (b>c) {
					if (b>d) {
						if (b>e) {
							big=b;
						}else {
							big=e;
						}
					}
				}
			}
			if (c>a) {
				if (c>b) {
					if (c>d) {
						if (c>e) {
							big=c;
						}else {
							big=e;
						}
					}
				}
			}
			if (d>a) {
				if (d>b) {
					if (d>c) {
						if (d>e) {
							big=d;
						}else {
							big=e;
						}
					}
				}
			}
			if (e>a) {
				if (e>b) {
					if (e>c) {
						if (e>d) {
							big=e;
						}else {
							big=d;
						}
					}
				}
			}
	System.out.print("The Biggest Number is "+big);
	}
}