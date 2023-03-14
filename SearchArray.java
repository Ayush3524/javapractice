import java.util.Scanner;
class SearchArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Array Length: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter The Array Elements :");
			for (int i=0;i<n ;++i ) {
			 	arr[i]=sc.nextInt();
			}
			System.out.print("Enter The Index Number Of Array: ");
			int key=sc.nextInt();
			System.out.print("The Search Result is: ");
			for (int i=0;i<n ;++i ) {
				if (i==key) {
					System.out.print(arr[i]);
				}
			}
	}
}