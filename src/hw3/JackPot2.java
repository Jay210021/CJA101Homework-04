package hw3;

import java.util.Scanner;

public class JackPot2 {
	public static void main(String[] args) {
		System.out.println("阿文...請輸入你討厭哪個數字？");
		Scanner sc = new Scanner(System.in);
		int hatenum = sc.nextInt();
		int hate[] = new int[14];
		
//		把不符合的數字記載陣列中
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 == hatenum || i / 10 == hatenum) {
				hate[count] = i;
				count++;
				continue;
			}
		}
//		System.out.println();
//
//		System.out.println("以下是討厭的數字");
//		for(int i = 0; i < 14; i++) {
//			System.out.print(hate[i]+"\t");
//		}
//		
//		System.out.println();
		
//      比對數字
		
		int data[] = new int[6];
		for (int i = 0; i < 6; i++) {//依序選出六個數字
			boolean check = true;
			while (check) {
				check = false;
				data[i] = (int)(Math.random() * 49 + 1);
				for (int j = 0; j < 14; j++) {
					if (data[i] == hate[j]) {//比對亂數產生的數字跟不符合的數字
						check = true;
						break;
					}
				}
				for (int j = 0; j < i && (!check); j++) {//比對有沒有重複
					if (data[j] == data[i]) {
						check = true;
						break;
					}
				}
			}		
		}
		
		for (int j = 0; j < 6; j++) {
			System.out.println(data[j]);
		}
		sc.close();
	}
}
