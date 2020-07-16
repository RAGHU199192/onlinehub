package basics;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "raghu";
		char c[] = a.toCharArray();
		for (int b = a.length() - 1; b >= 0; b--) {
			System.out.print(c[b]);
		}
	}

}
