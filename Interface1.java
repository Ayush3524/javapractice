interface Abc{
	void m1();
	void m2();
	void m3();
}
class Test implements Abc{
	public void m1(){
		System.out.println("m1 Method");
	}
	public void m2(){
		System.out.println("m2 Method");
	}
	public void m3(){
		System.out.println("m3 Method");
	}
}
class Interface1{
	public static void main(String[] args) {
		Abc t=new Test();
		t.m1();
		t.m2();
		t.m3();
	}
}