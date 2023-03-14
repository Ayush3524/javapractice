import java.util.Scanner;
class RearrangeArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Array Length: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter The Array Elements :");
			for (int i=0;i<n ;++i ) {
			 	arr[i]=sc.nextInt();
			}
			int i=-1;
			for (int j=0;j<n ;j++ ) {
				if (arr[j]>0) {
					i=i+1;
					arr[i]=(arr[i]+arr[j])-(arr[j]=arr[i]);
				}
			}
			int positive=0,negative=i+1;
			while (negative<n && negative>positive && arr[negative]<0) {
				arr[negative]=(arr[negative]+arr[positive])-(arr[positive]=arr[negative]);
				positive=positive+2;
				negative=negative+1;
			}
			for (int k=0;k<n ;k++ ) {
				System.out.print(arr[k]+" ");
			}
	}
}