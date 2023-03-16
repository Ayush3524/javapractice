class Static5{
	static{
		System.out.println("I am in static block 1");
	}
	static{
		System.out.println("I am in static block 2");
	}
	public static void main(String[] args) {
		System.out.println("I am in main");
	}
	static{
		System.out.println("I am in static block 3");
	}
}