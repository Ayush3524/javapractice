class A{
	private int a=1;
	public void show(){
		System.out.println(a);
	}
}
class PrivateModifier{
	public static void main(String[] args) {
		A obj=new A();
		obj.show();
	}
}