import java.util.Scanner;
class Fibnocci{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Value: ");
		int f0=sc.nextInt();
		System.out.print("Enter 2nd Value: ");
		int f1=sc.nextInt();
		System.out.print(f0+" "+f1);
		int count=10;
		for (int i=2;i<count;++i ) {
			int f2=f0+f1;
			System.out.print(" "+f2);
			f0=f1;
			f1=f2;
		}
	}
}