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
		int sm=0;
			if (a<b) {
				if (a<c) {
					if (a<d) {
						sm=a;
					}else{
						sm=d;
					}
				}
			}
			if (b<a) {
				if (b<c) {
					if (b<d) {
						sm=b;
					}else {
						sm=d;
					}
				}
			}
			if (c<a) {
				if (c<b) {
					if (c<d) {
						sm=c;
					}else {
						sm=d;
					}
				}
			}
			if (d<a) {
				if (d<b) {
					if (d<c) {
						sm=d;
					}else {
						sm=c;
					}
				}
			}
	System.out.print("The Biggest Number is "+sm);
	}
}