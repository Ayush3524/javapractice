import java.util.Scanner;
class Large{
	public int l(int a,int b){
		int big=0;
		if (a>b) {
			big=a;
		}else {
			big=b;
		}
		return big;
	} 
}

class LargeNoUsingClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Two Numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Large obj=new Large();
		int res=obj.l(a,b);
		System.out.print("The Large Number is: "+res);
	}
}