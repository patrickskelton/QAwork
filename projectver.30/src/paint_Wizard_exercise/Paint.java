package paint_Wizard_exercise;

public class Paint {
	
	
private String paintName;
private int paintVolume;
private int paintPrice;
private int paintCapacity;


public static int count;


	public Paint(String name,int volume,int price,int capacity) {
		paintCapacity =capacity;
		paintName=name;
		paintVolume = volume;
		paintPrice = price;
	}
	public int getPaintCapacity(){
	return paintCapacity;
	}

	public String getPaintName() {
		return paintName;
	}

	public int getPaintVolume() {
		return paintVolume;
	}

	public int getPaintPrice() {
		return paintPrice;
	}
	
}
