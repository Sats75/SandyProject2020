package JavaFeb2020;

public class LoginPgMO {


		public void loginPage(String SocialMediaID) {
			System.out.println("0 param");
		}		

		public void loginPage(String username , String Password) {
			System.out.println("2 params");
		}		

		public void loginPage(String username , String Password,String text) {
			System.out.println("3 params");
		}		

			
		
	public static void main(String[] args) {
		LoginPgMO lp = new LoginPgMO();	
		lp.loginPage("Sandy");
		lp.loginPage("GG", "gg12");
	
		
		
	}

}
