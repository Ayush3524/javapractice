//Final Method
class FinalMethod{
	final void demo(){
		System.out.println("FinalMethod class Method");
	}
}
class ABC extends FinalMethod{
	void demo(){
		System.out.println("ABC Class Method");
	}
	public static void main(String[] args) {
		ABC obj=new ABC();
		obj.demo();
	}
}