import java.util.Scanner;
class ArithOp{
     public static void main(String[] args) {
     	Scanner sc=new Scanner(System.in);
     	System.out.print("\nEnter first Number: ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number: ");
	    int b=sc.nextInt();
	    Scanner ch=new Scanner(System.in);
	    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
	    System.out.println("Enter Your Choice: ");
	    int n=ch.nextInt();
		switch (n){
	        case 1:
                int res=a+b;
                System.out.println("Addition is "+res);
               	break;
            case 2:
            	 int res1=a-b;
            	 System.out.println("Subtraction is "+res1);
            	 break;
            case 3:
         	     int res2=a*b;
         	     System.out.println("Multiplication is "+res2);
         	     break;
            case 4:
        	     float res3=a/b;
        	     System.out.println("Division is "+res3);
        	     break;
            default: 
         	     System.out.println("Wrong Choice.");
        	     break;
	 	}
    }
}