package JavaFeb2020;

public class User {

	// Class variables
	String name;
	String emailid;
	long phonenumber;
	boolean isActive;

	// Class methods
	public String getUserOrderDetails(String userName) {
		if (userName.equals("Santhiya")) {
			return "MacBook";
		}else if (userName.equals("Gayathiri"))
			return "Samsung";
		else {
			System.out.println(userName + "is not found");
			return "user not found";
		}

	}

}
//Same assignment to return phone number 