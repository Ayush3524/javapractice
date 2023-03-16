class Rectangle{
	int l1,l2,b1,b2,res1,res2;
	public Rectangle(int x1,int y1,int x2,int y2){
		l1=x1;
		b1=y1;
		l2=x2;
		b2=y2;
	}
	public int area1(){
		res1=l1*b1;
		return res1;
	}
	public int area2(){
		res2=l2*b2;
		return res2;
	}
}
class RectangleClass{
	public static void main(String[] args) {
		Rectangle obj=new Rectangle(4,5,5,8);
		int res1=obj.area1();
		int res2=obj.area2();
		System.out.println("The Area Of 1st Rectangle is "+res1);
		System.out.println("The Area Of 2nd Rectangle is "+res2);
	}
}