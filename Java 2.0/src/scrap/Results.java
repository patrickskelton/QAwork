package scrap;

public class Results {
	private int phy,che,math;
	private int error =0;
	private int pass=0;
	
	public int pass(int sub) {
		if(sub>=60) {
			return 1;
		}
		else {
			return 0;
		}
	}
	

	public void setPhy(int A) {
		if(A>=0 && A<=150) {
			phy = A;
			
		}
		else {
			System.out.println("Invalid Physics marks");
			error++;
			
		}
	}
	public void setMath(int A) {
		if(A>=0 && A<=150) {
			math = A;
		}
		else {
			System.out.println("Invalid Mathmatics marks");
			error++;
		}
	}

	public void setChe(int A) {
		if(A>=0 && A<=150) {
			che = A;
		}
		else {
			System.out.println("Invalid Chemistry marks");
			error++;
		}
	}
	public void showResults() {
		int total,per;
		total=phy+che+math;
		switch(pass(phy)+pass(che)+pass(math)) {
		case 0:
			if(error ==0) {
			System.out.println("GO HOME");
			break;}
			else {
				System.out.println("invalid marks entered");
				break;
			}
		case 1:
			if(error ==0) {
			System.out.println("retake the course");
			break;
			}
			else {
				System.out.println("invalid marks entered");
				break;
			}
		case 2:
			if(error ==0) {
			if(pass(phy)==0) {
				System.out.println("Retake physics exam");
				break;
			}
			else if(pass(che)==0) {
				System.out.println("Retake chemistry exam");
				break;
			}
			else {
				System.out.println("Retake Math exam");
				break;
			}
			}
			else {
				System.out.println("invalid marks entered");
				break;
			}
		case 3:
			if(error ==0) {
			
				per=total*100/450;
				System.out.println("Total marks"+total);
				System.out.println("Percentage:"+per);
				break;
		
			}
			else {
				System.out.println("invalid marks entered");
				break;
			}
			
		}
	}
}
