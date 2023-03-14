class JumpStatement{
	public static void main(String[] args) {
		int n=6;
		for (int i=1;i<=5 ;++i ) {
			if (i==3) {
				continue;
			}
			System.out.println(i+" "+(n-i));
		}
	}
}