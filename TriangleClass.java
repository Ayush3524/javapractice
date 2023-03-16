class Triangle{
	public Triangle(){
		int a=4,b=5,h=6;
		double area=0.5*b*h;
		int perimeter=a+b+h;
		System.out.println("The Area Of Triangle is: "+area);
		System.out.println("The Perimeter Of Triangle is: "+perimeter);
	}
}
class TriangleClass{
	public static void main(String[] args) {
		Triangle obj=new Triangle();
	}
}