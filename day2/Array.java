package week1.day2;

public class Array {
	public static void main(String[] args) {

		int arr[]= {1,5,7,8,9,0,4,5,2,3,11,21,32,5,23,67};
		int count=0;
		for(int i=0; i<arr.length;i++){
			if(arr[i]==5) {
				count++;
			}
		}
		System.out.println("Count of 5's in given array is:" +count);

	}
}
