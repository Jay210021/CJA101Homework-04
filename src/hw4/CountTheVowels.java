package hw4;

public class CountTheVowels {
	public static void main(String[] args) {
		String planet[] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		String temp = "";
		for (int i = 0; i < planet.length; i++) {
			temp += planet[i];
		}
		
		int count = countLetter(temp, 'a') + countLetter(temp, 'e') + countLetter(temp, 'i') + countLetter(temp, 'o') + countLetter(temp, 'u');
		System.out.print(count);
	}
	
	
	public static int countLetter(String target, char letter) {
		int count = 0;
		for (int i = 0; i < target.length(); i++) {
			if (target.charAt(i) == letter)  {
				count++;
			}
		}
		return count;
	}
}
