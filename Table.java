import java.util.Scanner;
class Table{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int n=sc.nextInt();
		  for (int i=0;i<=10 ;++i ) {
		  	System.out.println(n+" x "+i+" = "+(n*i));
		  }
	}
}