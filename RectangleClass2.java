import java.util.Scanner;
class Rectangle{
	int l,b,area;
	public Rectangle(int x,int y){
		l=x;
		b=y;
	}
	public int Area(){
		area=l*b;
		return area;
	}
}
class RectangleClass2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length and Breadth: ");
		int a=sc.nextInt();
		int c=sc.nextInt();
		Rectangle obj=new Rectangle(a,c);
		int res=obj.Area();
		System.out.println("The Area Of Rectangle is "+res);
	}
}