package oopssample;

import oopsmain.Raghu;

public class Loaneligible {
	public String employer() {
		int flag=0;
		int loan[] = { 50000, 60000, 70000, 80000, 90000 };
		Raghu x = new Raghu();
		for (int b = 0; b < loan.length; b++) {
			int sal = x.employee();
			if (loan[b] == sal) {
				flag=1;
				break;
			} else {

				continue;
			}
		}
		if(flag==1){
			return "Eligible";
		}else {
			return "Not eligible";
		}

	}
}