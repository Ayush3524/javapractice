//Constructor Calling Hierarchy
class A{
	public A(){
		System.out.println("Class A Constructor");
	}
	public void showA(){
		System.out.println("Class A Show");
	}
}
class B extends A{
	public B(){
		System.out.println("Class B Constructor");
	}
	public void showB(){
		System.out.println("Class B Show");
	}
}
class ConstructorCalling{
	public static void main(String[] args) {
		B obj=new B();
		obj.showB();
	}
}