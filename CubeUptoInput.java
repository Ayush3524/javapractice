import java.util.Scanner;
class CubeUptoInput{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of terms: ");
		int n=sc.nextInt();
		int cube;
		 for (int i=1;i<=n ;++i ) {
		 	cube=i*i*i;
		 	System.out.println("Number is: "+i+" and cube of "+i+" is: "+cube);
		 }
	}
}