import java.util.Scanner;
class CostPrice{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Cost Price: ");
		double cp=sc.nextDouble();
		System.out.print("Are You a Student(y/n): ");
		char st=sc.next().charAt(0);
		double d;
		 if (st=='y') {
		 	if (cp>500) {
		 		d=cp*0.1;
		 		cp=cp-d;
		 		System.out.print("The Gross Price is "+cp);
		 	}else {
		 		d=cp*0.05;
		 		cp=cp-d;
		 		System.out.print("The Gross Price is "+cp);
		 	}
		 }
		 if (st=='n') {
		 	if (cp>500) {
		 		d=cp*0.08;
		 		cp=cp-d;
		 		System.out.print("The Gross Price is "+cp);
		 	}else {
		 		d=cp*0.02;
		 		cp=cp-d;
		 		System.out.print("The Gross Price is "+cp);
		 	}
		 }
	}
}



