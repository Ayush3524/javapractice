class This{
	int a,b;
	This(int a,int b){
		this.a=a;
		this.b=b;
	}
	void display(){
		System.out.println("a="+a+" b="+b);
	}
	public static void main(String[] args) {
		This obj=new This(40,80);
		obj.display();
	}
}