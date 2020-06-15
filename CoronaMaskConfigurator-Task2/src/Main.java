import properties.PropertyManager;

public class Main {

	public static void main(String[] args) {
		if (PropertyManager.getProperty("Edition")) {
			System.out.print("You have selected following Edition: ");
			
			if (PropertyManager.getProperty("Private")) {
				System.out.print("Private (For \"Otto normal user\".)");
			}
			else if (PropertyManager.getProperty("Medical")) {
				System.out.print("Medical (For professionals in health sector.)");
			}
			System.out.println();
		}
		
		
		if (PropertyManager.getProperty("MaterialLayer")) {
			System.out.print("You have selected following MaterialLayer: ");
			
			if (PropertyManager.getProperty("One")) {
				System.out.print("One (Your mask is just good for fashion usage.)");
			}
			else if (PropertyManager.getProperty("Two")) {
				System.out.print("Two (You are a normal person who wants to protect others from the corona virus.)");
			}
			else if (PropertyManager.getProperty("Three")) {
				System.out.print("Three (It is uncertain whether you can breath with this selection. Usage at your own risk!!!)");
			}
			System.out.println();
		}
		
		
	}
}
