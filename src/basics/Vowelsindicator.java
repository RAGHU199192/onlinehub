package basics;

public class Vowelsindicator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alp = "welcome";
		int vowels[] = { 'a', 'e', 'i', 'o', 'u' };
		char[] divide = alp.toCharArray();
		for (int alpha = 0; alpha < divide.length; alpha++) {
			int flag = 0;
			for (int beta = 0; beta < vowels.length; beta++) {
				if (divide[alpha] == vowels[beta]) {
					flag = 1;
					System.out.println(divide[alpha] + " Alphabet is vowel");
					break;
				} else {
					
					continue;
				}
				
				}
				if (flag == 0) {
					System.out.println(divide[alpha] + " Alphabet is consonant");
				}
			}
		}
	}
