class A{
	private int a;
	public void setA(int x){
		a=x;
	}
	public int getA(){
		return a;
	}
}
class FullyEncapsulated{
	public static void main(String[] args) {
		A obj=new A();
		obj.setA(55);
		System.out.println(obj.getA());
	}
}