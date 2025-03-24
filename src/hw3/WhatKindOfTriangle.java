package hw3;

import java.util.Scanner;

public class WhatKindOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入第一個數字");
		double data1 = sc.nextInt();
		System.out.println("請輸入第二個數字");
		double data2 = sc.nextInt();
		System.out.println("請輸入第三個數字");
		double data3 = sc.nextInt();
		
		if (!((data1 + data2) > data3 && (data1 + data3) > data2 && (data2 + data3) > data1)) {
			System.out.println("不是三角形");
		}
		else if(data1 == data2 && data2 == data3) {
			System.out.println("正三角形");
		}else if(data1 == data2 || data2 == data3) {
			System.out.println("等腰三角形");
		}else if((Math.pow(data1,2) + Math.pow(data2,2)) == Math.pow(data3, 2) || (Math.pow(data1,2) + Math.pow(data3,2)) == Math.pow(data2,2) || (Math.pow(data2,2) + Math.pow(data3,2)) == Math.pow(data1,2)) {
			System.out.println("直角三角形");
		}else {
			System.out.println("普通三角形");
		}
	}
}
