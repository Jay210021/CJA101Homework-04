package hw5;

import java.util.Scanner;

public class PrintSquare {
	public static void main(String[] args) {
		System.out.println("請輸入長方形的寬");
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		System.out.println("請輸入長方形的高");
		int height = sc.nextInt();
		starSquare(width, height);
		sc.close();
	}
	
	public static void starSquare(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
