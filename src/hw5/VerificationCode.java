package hw5;

public class VerificationCode {
	public static void main(String[] args) {
		genAuthCode();
	}
	
	public static void genAuthCode() {
		int data[] = new int [8];
		for (int i = 0; i < 8; i++) {
			boolean check = true;
			while (check) {
				check = false;
				data[i] = (int)(Math.random() * 123);
				if (data[i] < 48 || data[i] > 57 && data[i] < 65 || data[i] > 90 && data[i] < 97 ) {
					check = true;
				}
			}
		}
		
		char data2[] = new char[8];
		for (int i = 0; i < 8; i++) {
			int temp = 0;
			temp = data[i]; 
			data2[i] = (char)(temp);
			System.out.print(data2[i]);
		}
		
		
	}
	
	
}
