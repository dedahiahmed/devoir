package mr.iscae;

public class admin {
	
	
	private static  String login = "admin";
	private static  String password ="admin";
	
	
	public admin() {
		
	}
	

	

	
	
	
	public static String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		admin.login = login;
	}
	public static String getPassword() {
		return password;
	}
	public static void  setPassword(String password) {
		admin.password = password;
	}
	
	 public static boolean checkLogin(String login, String password) {
	       
	        if( login.equals(getLogin()) &&  password.equals(getPassword())){
				
				return true;
			}
			else{
				 return false;
			}
	    }

}
