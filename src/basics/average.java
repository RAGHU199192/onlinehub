package basics;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int e = 65, t = 74, m = 90, so = 75, sci = 65;
		int sum = e + t + m + so + sci;
		int average = sum / 5;
		if (average <= 80) {
			System.out.println("your mark is " + average + " first class");
		} else if (average >= 60 && average <= 80) {
			System.out.println("your mark is " + average + " second class");
		} else if (average >= 35 && average <= 60) {
			System.out.println("your mark is " + average + " third class");
		} else {
			System.out.println("your average mark is" + average + " Fail");
		}

	}

}