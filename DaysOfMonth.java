import java.util.Scanner;
class DaysOfMonth{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Month Number: ");
		int n=sc.nextInt();
		System.out.print("Enter The Year: ");
		int yr=sc.nextInt();
		String month="";
		int days=0;
			switch(n){
			case 1:
				month="January";
				days=31;
				break;
			case 2:
				month="February";
					if (yr%4==0) {
						days=29;
					}else {
						days=28;
					}
				break;
			case 3:
				month="March";
				days=31;
				break;
			case 4:
				month="April";
				days=30;
				break;
			case 5:
				month="May";
				days=31;
				break;
			case 6:
				month="June";
				days=30;
				break;
			case 7:
				month="July";
				days=31;
				break;
			case 8:
				month="August";
				days=31;
				break;
			case 9:
				month="September";
				days=30;
				break;
			case 10:
				month="October";
				days=31;
				break;
			case 11:
				month="November";
				days=30;
				break;
			case 12:
				month="December";
				days=31;
				break;
			}
	System.out.print(month+" "+yr+" has "+days+" days");
	}
}