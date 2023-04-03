package week1.day2;

public class Fibbinocci {
	public static void main(String[] args) {
		int firstnum=0;
		int secondnum=1;
		int sum=0;
		System.out.println(firstnum);
		for(int i=1;i<=9;i++) {
			sum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			System.out.println(sum);
		}
	}

}
