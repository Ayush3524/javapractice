//Final Class
final class A{

}
class FinalClass extends A{
	void demo(){
		System.out.println("I am in A");
	}
	public static void main(String[] args) {
		FinalClass obj=new FinalClass();
		obj.demo();
	}
}