package hw4;

public class CountTheTimes {
	public static void main(String[] args){
		int grades[][] = {
			{10,37,100,77,98,90},
			{35,75,70,95,70,80},
			{40,77,79,70,89,100},
			{100,89,90,89,90,75},				
			{90,64,75,60,75,50},
			{85,75,70,75,90,2},
			{75,70,79,85,89,99},
			{70,95,90,89,90,75}
		};
		int timesOfTheFirstPlace[] = {0, 0, 0, 0, 0, 0, 0, 0};
		for (int i = 0; i < 6; i++) {
			int temp = 0;
			int num = 0;
			for (int j = 0; j < 8; j++) {
				if (grades[j][i] > temp) {
					temp = grades[j][i];
					num = j;
				}
			}
			timesOfTheFirstPlace[num] += 1;
		}
		for (int i = 0; i < 8; i++) {
			System.out.println("第"+ (i + 1) + "位同學考最高分的次數是" + timesOfTheFirstPlace[i] + "次");
		}

	}
}
