package hw2;

public class Math {
	public static void main(String[] args) {
		//計算1~1000的偶數和
		int sum = 0;
		for(int i = 0; i <= 1000; i = i +2) {
			sum += i;
		}
		System.out.println(sum);
		
		//計算1~10的連乘積用for迴圈
		int result1 = 1;
		for(int i = 1; i <= 10; i++) {
			result1 *= i;
		}
		System.out.println(result1);
		
		//計算1~10的連乘積用while迴圈
		int result2 = 1;
		int i = 1;
		while(i <= 10) {
			result2 *= i;
			i++;
		}
		System.out.println(result2);
		
		//輸出1~10的平方
		for(int j = 1; j <= 10; j++) {
			System.out.print(j*j+" ");
		}

	}

}
