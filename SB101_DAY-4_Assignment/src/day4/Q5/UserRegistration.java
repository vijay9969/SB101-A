package day4.Q5;

public class UserRegistration {
	
	public void registerUser(String username, String userCountry) throws InvalidCountryException{
		
		if("India".equals(userCountry)) {
			
			
			
			System.out.println("User registration done successfully");
			
		}else {
			InvalidCountryException IC = new InvalidCountryException("User Outside India cannot be registered");
			throw IC;
		}
	}

}
