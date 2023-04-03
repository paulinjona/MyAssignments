package week1.day2;

public class CarDetails {

	public String PrintCarName() {
		return "WAGONR";
	}
	private int getCarNum() {
		return 2947;
	}
	public boolean isPuncture() {
		return true;
	}
	public int multiplyThreeNum() {
		int a=2, b=2, c=2;
		return a*b*c;
	}
	public String getCarModel() {
		return "VXI";
	}
	public static void main(String[] args) {
		
	CarDetails obj= new CarDetails();			
			String PrintCarName=obj.PrintCarName();
			System.out.println(PrintCarName);
			int getCarNum=obj.getCarNum();
			System.out.println(getCarNum);
			int multiplyThreeNum=obj.multiplyThreeNum();
			System.out.println(multiplyThreeNum);
			String getCarModel= obj.getCarModel();
			System.out.println(getCarModel);
			boolean isPuncture= obj.isPuncture();
			System.out.println(isPuncture);
			
	}
			
} 