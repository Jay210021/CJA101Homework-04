package hw4;

import java.util.Scanner;

public class BorrowMoney {
	public static void main(String[] args) {
		int money[][] = {{25,3500}, {32, 800}, {8, 500}, {19, 1000}, {27,1200}};
		int count = 0;
//		for (int i = 0; i < 5; i++) {
//			System.out.println(money[i][1]);
//		}
		System.out.println("你想借多少錢?");
		String num = " ";
		Scanner sc = new Scanner(System.in);
		int borrowAmount = sc.nextInt(); 
		for (int i = 0; i < 5; i++) {
			if (money[i][1] >= borrowAmount) {
				num += money[i][0]+" ";
				count++;
			}
		}
		System.out.println("有錢可借的員工編號:"+ num + " 共 " + count + " 人 ！");
		sc.close();
	}
	
}
