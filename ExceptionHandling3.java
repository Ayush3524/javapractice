class ExceptionHandling3{
	public static void main(String[] args) {
		try{
			System.out.println("I am in try");
		}
		catch(ArithmeticException ae){
			System.out.println("I am in catch");
		}
		finally{
			System.out.println("I am in finally");
		}
		System.out.println("After try/catch/finally");
	}
}