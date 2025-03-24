package hw4;

public class ArrayCount {
	public  static void main(String[] args) {
		int array[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		System.out.println(theAverage(array));
		theBiggerNum(array);
	}
	
	
	public static double theAverage(int num[]) {
		double sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum / num.length;
	}
	
	public static void theBiggerNum(int num[]) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] > theAverage(num)) {
				System.out.print(num[i]+"\t");
			}
		}
	}
}
