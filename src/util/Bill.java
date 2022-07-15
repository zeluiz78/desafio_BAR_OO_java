package util;

public class Bill {

	
	public static char gender;
	public static int beer;
	public static int barbecue;
	public static int softDrink;
	public static double ticket;
	
	static double couvert;
	
	
	// PRICE TICKET
	public static double ticket() {
		if (gender == 'F') {
			ticket = (int) 8.0;
		}
		else {
			ticket = (int) 10.0;
		}
		return ticket;
		
	}
	
	// FEEDING
	public static double  feeding() {
		return beer * 5.0 + softDrink * 3.0 + barbecue * 7.0;
		
	}
	
	// PRICE COUVERT 
	public static double couvert() {
		
		if (feeding() > 30.00) {
			couvert = 0;
		}
		else {
			couvert = 4.00;
		}
						
		return couvert; 
	}
	
	//	amount payable
	public static double total() {
		
		return feeding() + couvert() + ticket();
	}
	
}
