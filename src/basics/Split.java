package basics;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "(1,00,100)";
		String a[] = x.split("\\(");
		String b[] = a[1].split("\\)");
		String c[] = b[0].split(",");
		for(int d=0;d<c.length;d++){

		System.out.print(c[d]);
	}

}}
