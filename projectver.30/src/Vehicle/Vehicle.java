package Vehicle;

abstract class Vehicle{
	public boolean condition =true;
	public String vehicleID;
	public int yearsOld;
	public Vehicle(String ID,int Old) {
		System.out.print("new vehicle registered");
		vehicleID=ID;
		yearsOld = Old;
	}
	public void start() {
		System.out.println("Vroom!");
	}
	
	public String getID() {
		return vehicleID;
	}
	public int getAge() {
		return yearsOld;
	}
	public abstract int cost(int imput1);
	public boolean fixIT(boolean fixit) {
		if(fixit && condition) {
			condition = !condition;
			return true;	
		}
		else {
			return false;
		}
	}
}
