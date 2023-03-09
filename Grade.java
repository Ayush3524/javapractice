import java.util.Scanner;
class PrMks4{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter 1st Paper Marks: ");
		double m1=in.nextDouble();
		System.out.print("Enter 2nd Paper Marks: ");
		double m2=in.nextDouble();
		System.out.print("Enter 3rd Paper Marks: ");
		double m3=in.nextDouble();
		System.out.print("Enter 4th Paper Marks: ");
		double m4=in.nextDouble();
		double total,per;
		char gr;
		total=m1+m2+m3+m4;
		per=total/4.0;
		  if (per>=90) {
		  	   gr='A';
		  }
		  else if (per>=80 && per<90) {
		  	   gr='B';
		  }
		  else if (per>=70 && per<80) {
		  	   gr='C';
		  }
		  else if (per>=60 && per<70) {
		  	   gr='D';
		  }
		  else if (per>=40 && per<60) {
		  	   gr='E';
		  }
		  else{
		  	gr="Fail";
		  }
		System.out.println("percentage Obtained: "+per);
		System.out.println("Grade is "+gr);
	}
}