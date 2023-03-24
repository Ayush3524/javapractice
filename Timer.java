class Timer{
	public static void main(String[] args) {
		try{
			for (int i=1;i<=10 ;++i ) {
				System.out.println(i);
				Thread.sleep(400);
			}
		}catch(Exception e){}
	}
}