package hw5;

public class AverageOfRandomNumbers {
	public static void main(String[] args) {
		randAvg(100, 10);
	}
	
	public static void randAvg(int maxNum, int amountOfNumber) {
		int pickNum[] = new int [10];
		for(int i = 0; i < amountOfNumber; i++) {
			pickNum[i] = (int)(Math.random() * (maxNum + 1) );
		}
		
		double sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += pickNum[i];
			System.out.print(pickNum[i]+" ");
		}
		System.out.println();
		
		System.out.println(sum / 10);
		
	}
}
