package basics;

public class Missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = { 1, 2, 4, 5, 7 };
		for (int i = marks.length-1; i >= 0; i--) {
			
			if (i != 0) {
				int total = marks[i] - marks[i -1];
				if (total == 1) {
					continue;
				} else {
					
					System.out.println("missing number is " + (marks[i]-1));
				}

			} else {
				break;
			}
		}
	}
}
