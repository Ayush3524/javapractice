//Final Variable
class FinalVariable{
	final int MAX=89;
	void me(){
		MAX=110;
	}
	public static void main(String[] args) {
		FinalVariable obj=new FinalVariable();
		obj.me();
	}
}