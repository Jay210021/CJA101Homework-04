package hw2;

public class Triangle {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if(i + j <= 11) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
		char c = 'A';
		for(int i = 1; i <= 6; i++) {
			for(char j = 1; j <= i; j++) {
				System.out.print(c);
			}
			c += 1;
			System.out.println();
		}
		
//		char ans = 'A'+1;
//		System.out.print(ans);
	}
}
