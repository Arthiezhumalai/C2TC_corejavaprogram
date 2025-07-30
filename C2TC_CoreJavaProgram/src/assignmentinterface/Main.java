package assignmentinterface;

public class Main {
	
	// Main.java
	    public static void main(String[] args) {
	        AirIndia ai = new AirIndia("AirIndia Express", 6200.0);
	        ai.bookTicket();

	        KingFisher kf = new KingFisher("KingFisher Premium", 5800.0);
	        kf.bookTicket();
	    }
	}

