package hw3;

import java.util.Scanner;

public class GuessNumberGame {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*10);
//		System.out.println(answer);
		System.out.println("請輸入零到九其中一個整數");
		
//		System.out.println(answer);
//		System.out.println(guessnum);
		while(true) {
			Scanner sc = new Scanner(System.in);
			int guessnum = sc.nextInt();
			if(guessnum == answer) {
				System.out.println("答對了！答案就是"+answer);
				break;
			}
			else {
				System.out.println("猜錯囉QQ");
				continue;
			}
				
		}
	}
}
