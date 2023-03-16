class Static7{
	{
		System.out.println("I am in non static block");
	}
	static{
		System.out.println("I am in static block");
	}
	public static void main(String[] args) {
		Static7 s=new Static7();
		System.out.println("I am in main");
	}
}