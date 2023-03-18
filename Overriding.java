//Method Overriding
class A{
	public int a=20;
	public void show(){
		System.out.println("Class A Show");
		System.out.println("The value of a is "+a);
	}
}
class B extends A{
	public int a=40;
	public void show(){
		System.out.println("Class A Show");
		System.out.println("The value of a is "+a);
	}
}
class Overriding{
	public static void main(String[] args) {
		B obj=new B();
		obj.show();
	}
}