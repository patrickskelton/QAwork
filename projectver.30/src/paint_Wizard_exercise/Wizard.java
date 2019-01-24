package paint_Wizard_exercise;

import java.util.Scanner;
import java.util.ArrayList;
public class Wizard {

	public static int[] howMuch(Paint brand,int space){
		
		int vol = brand.getPaintVolume();
		int amount = (space/vol)+1;
		int waste = (space%vol);
		int price = brand.getPaintPrice();
		return new int[] {price*amount, waste};
	}
	public static void main(String[] args) {
		System.out.println("how much area of paint do you need");
		Scanner sc = new Scanner(System.in);
		
		int userinput = sc.nextInt();
		sc.close();
		
		
		Paint CheapoMax = new Paint("CheapoMax",200,20,10);
		Paint AverageJoes = new Paint("AverageJoes",15*11,18,11);
		Paint DuluxourousPaints = new Paint("DuluxourousPaints",200,25,20);
		ArrayList<Paint> types = new ArrayList<Paint>();
		types.add(CheapoMax);
		types.add(AverageJoes);
		types.add(DuluxourousPaints);
		ArrayList<Integer> costs = new ArrayList<Integer>();
		ArrayList<Integer> wastes = new ArrayList<Integer>();
		int len = types.size();
		for(int i=0;i<len;i++) {
			int cost = howMuch(types.get(i),userinput)[0];
			costs.add(cost);
			int waste = howMuch(types.get(i),userinput)[1];
			wastes.add(waste);
		}
		if(costs.get(0)>=costs.get(1) && costs.get(0)>= costs.get(2)) {
			System.out.println(types.get(0).getPaintName() + "is the cheapest paint costing " + "£" + costs.get(0));
		}
		else if(costs.get(1)>=costs.get(0) && costs.get(1)>= costs.get(2)) {
			System.out.println(types.get(1).getPaintName() + "is the cheapest paint costing " + "£" + costs.get(1));
		}
		else if(costs.get(2)>=costs.get(1) && costs.get(2)>= costs.get(0)) {
			System.out.println(types.get(2).getPaintName() + "is the cheapest paint costing " + "£" + costs.get(2));
		}
		
		
		if(wastes.get(0)>=wastes.get(1) && wastes.get(0)>= wastes.get(2)) {
			System.out.println(types.get(0).getPaintName() + "is the most efficient wasting " + wastes.get(0)/types.get(0).getPaintCapacity() + "litres");
		}
		else if(wastes.get(1)>=wastes.get(0) && wastes.get(1)>= wastes.get(2)) {
			System.out.println(types.get(1).getPaintName() + "is the most efficient wasting "  +wastes.get(1)/types.get(1).getPaintCapacity()+"litres");
		}
		else if(wastes.get(2)>=wastes.get(1) && wastes.get(2)>= wastes.get(0)) {
			System.out.println(types.get(2).getPaintName() + "is the most efficient wasting "  + wastes.get(2)/types.get(2).getPaintCapacity() + "litres");
		}
	}
}