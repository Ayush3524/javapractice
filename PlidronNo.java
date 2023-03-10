import java.util.Scanner;
class PlidronNo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int no=sc.nextInt();
		int rem,rev=0;
		int no1=no;
		do{
           rem=no1%10;
           rev=rev*10+rem;
           no1=no1/10;
		}while(no1>0);

		if (rev==no) {
		 	System.out.print(no+" is Palindrome Number");
		}else {
		 	System.out.print(no+" is not a Palindrome Number");
		}
	}
}