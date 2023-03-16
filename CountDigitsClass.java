import java.util.Scanner;
class Count{
	int cot=0,i=1;
	public int count(int no){
		do{
			no=no/10;
			cot++;
		}while(i<=no);
		return cot;
	}
}
class CountDigitsClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int n=sc.nextInt();
		Count obj=new Count();
		int res=obj.count(n);
		System.out.println("The Number Of Digits is "+res);
	}
}