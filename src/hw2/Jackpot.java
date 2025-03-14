package hw2;

public class Jackpot {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i<= 49; i++) {
			if(i % 10 == 4 || i / 10  == 4 ) {
				continue;
			}
			count++;
			System.out.println(i);
		}
		System.out.println("總共有"+count+"個");
	}

}
