import java.util.Scanner;
class Choices{
     public static void main(String[] args) {
     	Scanner sc=new Scanner(System.in);
     	System.out.println("Enter The Choice: ");
     	System.out.println("1.Square\n2.Cube\n3.Check Leap Year");
     	int n=sc.nextInt();
     	switch(n){
     	case 1:
     		System.out.println("Enter The Number: ");
     		int no=sc.nextInt();
     		System.out.println("The Square of "+no+" is "+(no*no));
     		break;
     	case 2:
     		System.out.println("Enter The Number: ");
     		int a=sc.nextInt();
     		System.out.println("The Cube of "+a+" is "+(a*a*a));
     		break;
     	case 3:
     		System.out.println("Enter The Year: ");
     		int yr=sc.nextInt();
     		 if (yr%4==0) {
     		 	System.out.println("The Year is Leap Year.");
     		 }else {
     		 	System.out.println("The Year is Not Leap Year.");
     		 }
     		 break;
     	default:
     		System.out.println("Wrong Choice.");
     	}
     }
}
