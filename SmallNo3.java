import java.util.Scanner;
class LpYr{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter 1st Number: ");
	int a=sc.nextInt();
	System.out.print("Enter 2nd Number: ");
	int b=sc.nextInt();
	System.out.print("Enter 3rd Number: ");
	int c=sc.nextInt();
	int sm=0;
	  if (a<b) {
	    	if (a<c) {
	   		    sm=a;
	   	    }else {
	   		    sm=c;
	   	    }
	   }
	   if (b<a) {
	    	if (b<c) {
	    		sm=b;
	    	}else {
	    		sm=c;
	    	}
	    }
	    if (c<a) {
	    	if (c<b) {
	    		sm=c;
	    	}else {
	    		sm=b;
	    	}
	    }
    System.out.print("The Smallest Number is "+sm);
	}
}