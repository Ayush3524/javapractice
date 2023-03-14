import java.util.Scanner;
class DayNo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number(1-7): ");
		int a=sc.nextInt();
		switch(a){
		case 1:
			System.out.print("It's Monday.");
			break;
		case 2:
			System.out.print("It's Tueday.");
			break;
		case 3:
			System.out.print("It's Wednesday.");
			break;
		case 4:
			System.out.print("It's Thrusday.");
			break;
		case 5:
			System.out.print("It's Friday.");
			break;
		case 6:
			System.out.print("It's Saturday.");
			break;
		case 7:
			System.out.print("It's Sunday.");
			break;
		default:
			System.out.print("Invalid Day Number..");
			break;
		}
	}
}