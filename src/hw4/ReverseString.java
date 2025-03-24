package hw4;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String target = s.nextLine();		
		char temp[] = new char[target.length()];
		for (int i = 0; i < target.length(); i++) {
			temp[i] = target.charAt(target.length()-1-i);
		}
		for (int i = 0; i < target.length(); i++) {
			System.out.print(temp[i]);
		}
	}
}
