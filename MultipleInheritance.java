//Program to achieve multiple inheritance
interface Abc{
	public void show();
}
class Pqr{
	static int i=20;
}
class MultipleInheritance extends Pqr implements Abc{
	public void show(){
		System.out.println("I am in Abc");
	}
	public static void main(String[] args) {
		Abc a;
		MultipleInheritance m=new MultipleInheritance();
		a=m;
		a.show();
		System.out.println(i);
	}
}