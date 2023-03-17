class ExceptionHandling{
	public static void main(String[] args) {
		System.out.println("Divide by zero");
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println(10/0);
			System.out.println(ae);
		}
		System.out.println("Reset of your application");
	}
}