package basics;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 0; x <= 10; x++) {
			boolean flag = false;
			for (int a = 2; a < x; a++) {
				if (x % a == 0) {
					flag = true;
					break;
				} else {
					continue;
				}
			
		}
		if (flag == false) {
			System.out.println(x +"is a prime number");
		} else {
			System.out.println(x + "its not a prime nmber");
		}
	}
	}
}