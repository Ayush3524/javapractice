class ArrayDemoc4{
	public static void main(String[] args) {
		int arr[]={2,3,1,11,4,10,33,7,2,5};
		int small,large,i;
		small=large=arr[0];
		 for (i=1;i<10 ;++i ) {
		 	if (arr[i]<small) {
		 		small=arr[i];
		 	}
		 	if (arr[i]>large) {
		 		large=arr[i];
		 	}
		 }
		System.out.print("Smallest no is "+small+" and Largest no is "+large);
	}
}