package hw3;

import java.util.Scanner;

public class JackPot3 {
	public static void main(String[] args) {
		//1.先取出不討厭的數放到陣列
		//2.假設有x個數，在x數中取random，把取到的數放到最後面，取六次後取最後面六個值就是答案
		System.out.println("阿文...請輸入你討厭哪個數字？");
		Scanner sc = new Scanner(System.in);
		int hatenum = sc.nextInt();
//		int hate[] = new int[14];
		int like[] = new int[49];
		
//		把不符合的數字記載陣列中123
//		int count = 0;
//		for (int i = 1; i <= 49; i++) {
//			if (i % 10 == hatenum || i / 10 == hatenum) {
//				hate[count] = i;
//				count++;
//			}
//		}
//		System.out.println("不喜歡的數字是");
//		for (int i = 0; i < 14; i++) {
//			System.out.println(hate[i]);
//		}
		int count1 = 0;
		for (int i = 1; i <= 49; i++) {//把沒在hate裡的丟進like
			if (i % 10 != hatenum && i / 10 != hatenum) {
				like[count1] = i;
				count1++;
			}
		}
//		count1--;
		
//		System.out.println("喜歡的數字是");
//		for(int i = 0; i <= count1; i++) {
//			System.out.println(like[i]);
//		}
//		System.out.println();
		
		
//		count1紀錄like非0的長度(Index)
//		int count2 = 48;
		for (int i = 0; i < 6; i++) {
			int choose = (int)(Math.random() * count1);
//			System.out.println("count1是"+count1);
//			System.out.println("抽到的數字是"+choose);
			like[48 - i] = like[choose];//把抽到的數字放到第48 47 46 45 44 43個裡面
			like[choose] = like[count1 - 1];//把最後面非0的數給抽到的數
//			System.out.println("原本like[count1]是"+like[count1]);
			like[count1 - 1] = 0;
//			System.out.println("like[count1]是"+like[count1]);
//			System.out.println("count1是"+count1);
			count1--;
		}
		
		for (int i = 48; i > 42; i--) {
			System.out.println(like[i]);
		}
		sc.close();
	}

}
