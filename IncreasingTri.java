class IncreasingTri{
	public static void main(String[] args) {
		int n=1;
		for (int i=1;i<=4 ;++i ) {
			for (int j=1;j<=i ;++j ) {
				System.out.print(n);
				n++;
			}
		System.out.println();
		}
	}
}