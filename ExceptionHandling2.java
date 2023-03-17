class ExceptionHandling2{
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}
		catch(Exception ae){
			System.out.println("Don't try to divide by 0");
		}
	}
}