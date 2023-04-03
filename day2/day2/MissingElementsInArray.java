package week1.day2;

public class MissingElementsInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		int sum2=0;

		for(int i=1;i<=8;i++) {
			sum2=sum2+i;
		}
		System.out.println("Missing Element in Array is :" + (sum2-sum1));
	}

}
