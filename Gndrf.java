import java.util.Scanner;
class Gndrf{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Paper Marks: ");
		int m1=sc.nextInt();
		System.out.print("Enter 2nd Paper Marks: ");
		int m2=sc.nextInt();
		System.out.print("Enter 3rd Paper Marks: ");
		int m3=sc.nextInt();
		System.out.print("Enter Gender(male/female) :");
		String gender=sc.next();
		int total=m1+m2+m3;
		double per=total/3.0;
		  if (per>=62 && gender.equals("female")) {
		  	  System.out.print("You can take Addmission");
		  }else {
		  	 System.out.print("You can't take Addmission");
		  }
	}
}