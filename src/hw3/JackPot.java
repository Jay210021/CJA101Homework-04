package hw3;

import java.util.Scanner;

public class JackPot {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("阿文...請輸入你討厭哪個數字？");
		Scanner sc = new Scanner(System.in);
		int hatenum = sc.nextInt();
		for(int i = 1; i <= 49; i++) {
			if(i % 10 == hatenum || i / 10  == hatenum ) {
				continue;
			}
			count++;
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("總共有"+count+"個");
		sc.close();
	}
}
