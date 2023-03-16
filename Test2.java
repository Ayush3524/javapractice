class Data{
	int a,b;
	Data(){
		this(10,20);
	}
	Data(int x,int y){
		a=x;
		b=y;
	}
	void show(){
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
class Test2{
	public static void main(String[] args) {
		Data d1=new Data();
		Data d2=new Data(100,200);
		d1.show();
		d2.show();
	}
}