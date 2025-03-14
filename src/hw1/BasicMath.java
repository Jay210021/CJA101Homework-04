package hw1;

public class BasicMath {
	public static void main(String[]args) {
		int sum = 12 + 6;
		int ans = 12 * 6;
		System.out.println("和為"+sum+",積為"+ans);
		
		
		int num1,num2;
		num1 = 200/12;
		num2 = 200%12;
		System.out.println(num1+"打"+num2+"顆");
		
		
		int day,hour,min,sec;
		day = 256559/86400;
		hour = (256559 - day * 86400)/3600;
		min = (256559 - day * 86400 - hour * 3600)/60;
		sec = (256559 - day * 86400 - hour * 3600 - min * 60);
		System.out.println("256559秒是"+day+"天"+hour+"小時"+min+"分"+sec+"秒");
		
		
		final double pi = 3.1415;
		double area = 5 * 5 * pi;
		double perimeter = 2 * 5 * pi;
		System.out.println("圓面積是"+area+",圓周長是"+perimeter);
		
		
		double total = 150;
		for(int i = 0; i < 10; i ++) {
			total = total * 1.02;
		}
		System.out.println("10年後本息共有"+total+"萬元");
		
		
		System.out.println(5+5);//數值相加
		System.out.println(5+'5');//5的unicode值為53
		System.out.println(5+"5");//當成兩個字串串接
		
		
				
	
	}
	
	
}
