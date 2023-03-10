import java.util.Scanner;
class SumFor{
	public static void main(String[] args) {
		int sum=0;
		for (int no=1;no<=20;++no) {
			if (no%2==0) {
				sum=sum+no;
			}
		}
		System.out.print("The Sum is "+sum);
	}
}