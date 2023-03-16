import java.util.Scanner;
class Fpa{
	int res1=1,sum=0;
	public int fact(int no){
		for (int i=0;i<no;--no) {
			res1=res1*no;
		}
		return res1;
	}
	public int amstrong(int no){
		while (no>0) {
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		return sum;
	}
	public int palindrome(int no){
		int rev=0;
		do{
           int rem=no%10;
           rev=rev*10+rem;
           no=no/10;
		}while(no>0);
		return rev;
	}
}
class FAPClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fpa obj=new Fpa();
		System.out.println("Enter The Choice: ");
		System.out.println("1.Fcatorial\n2.Check Amstrong Number\n3.Check Palindrome Number");
		int a=sc.nextInt();
		switch (a) {
			case 1:
				System.out.println("Enter any Number: ");
				int num=sc.nextInt();
				int res=obj.fact(num);
				System.out.println("The Factorial of "+num+" is "+res);
				break;
			case 2:
				System.out.println("Enter Number to Check: ");
				int numb=sc.nextInt();
				int sum=obj.amstrong(numb);
				if (sum==numb) {
					System.out.println(numb+" is Amstrong Number.");
				}else {
					System.out.println(numb+" is not Amstrong Number.");
				}
				break;
			case 3:
				System.out.println("Enter Number to Check: ");
				int number=sc.nextInt();
				int rev=obj.palindrome(number);
				if (rev==number) {
					System.out.println(number+" is Palindrome Number.");
				}else {
					System.out.println(number+" is Not Palindrome Number.");
				}
				break;
			default:
				System.out.println("Wrong Choice.....");
		}
	}
}