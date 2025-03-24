package hw3;

import java.util.Scanner;

public class GuessNumberGame2 {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*101);
//		System.out.println(answer);
		System.out.println("請輸入0到100其中一個整數");
		
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
				if(guessnum > answer) {
					System.out.println("你猜的大於正確答案");
					continue;
				}
				else {
					System.out.println("你猜的小於正確答案");
					continue;
				}
			}
				
		}
	}
}
