import java.util.Scanner;
class ArrayDemoc3{
	public static void main(String[] args) {
		int arr[]=new int[10],even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		 for (int i=0;i<10 ;i++ ) {
		 	System.out.print("Enter Value for arr["+i+"] : ");
		 	arr[i]=sc.nextInt();
		 	 if (arr[i]%2==0) {
		 	 	even++;
		 	 }else {
		 	 	odd++;
		 	 }
		 }
	System.out.print("Total Even= "+even+" and Odd= "+odd);
	}
}