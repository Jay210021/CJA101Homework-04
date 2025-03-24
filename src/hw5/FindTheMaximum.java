package hw5;

public class FindTheMaximum {
//	public static void main(String[] args) {
//		int intArray[][] = {
//				{1, 6, 3}, 
//				{9, 5, 2}
//			};
//
//		double doubleArray[][] = {
//				{1.2, 3.5, 2.2},
//				{7.4, 2.1, 8.2}
//		};
//		
//		System.out.println(maxElement(intArray));
//		System.out.println(maxElement(doubleArray));
//	}
	
	
	int maxElement(int x[][]){
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if(x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
	
	double maxElement(double x[][]){
		double max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if(x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
}
