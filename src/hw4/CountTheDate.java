package hw4;

import java.util.Scanner;

public class CountTheDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入年分");
		int year = sc.nextInt();
		
		System.out.println("請輸入月分");
		int month = sc.nextInt();
		
		int day = 0;
		do{
			System.out.println("請輸入日期");
		day = sc.nextInt();
		}while(((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)&& (day > 31)) ||
			(month == 4 || month == 6 || month == 9 || month == 11) && (day > 30) 
			|| (year % 4 == 0 && month == 2 && day > 29) || (year % 4 != 0 && month == 2 && day > 28));
		
//		System.out.println(year + " " + month + " "+ day);
		
		int countTheDay = 0;
		int dayOfTheMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < month - 1; i++) {
			countTheDay += dayOfTheMonth[i];
		}
		countTheDay += day;
		
		if (year % 4 == 0 && month > 3) {
			countTheDay += 1;
		}
		
		System.out.println("輸入的日期為該年第" + countTheDay + "天");
		
	}
}
