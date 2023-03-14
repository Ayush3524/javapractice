import java.util.Scanner;
class SumOfOdd{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of terms: ");
		int n=sc.nextInt();
		System.out.println("The n Odd Numbers are: ");
		int sum=0;
		  for (int i=1;i<=(n*2) ;++i ) {
		  	if(i%2!=0){
		  		System.out.println(i);
		  		sum=sum+i;
		  	}
		  }
		System.out.println("The Sum of odd Natural Number upto "+n+" terms is: "+sum);
	}
}