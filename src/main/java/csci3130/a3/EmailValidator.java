package csci3130.a3;

public class EmailValidator {
	private String emailAddress = "";

	
	public EmailValidator(){}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
<<<<<<< HEAD
	 * @param emailAddress the emailAddress to set
=======
	 * @param emailAddress the emailAddress to set  
>>>>>>> fa0a3d6 a3-stage1
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public boolean isValid(){
		boolean b1 = isOneAt(emailAddress);
		boolean b2 = isPoint(emailAddress);
		boolean result = b1 && b2;
		return result;
	}
	
	public boolean isOneAt(String forTest) {
		boolean checkIfExit = forTest.contains("@");
		boolean checkIfSingal = forTest.indexOf("@") == forTest.lastIndexOf("@");
		boolean result = checkIfExit && checkIfSingal;
		return result;
	}
	
	public boolean isPoint(String forTest) {
		boolean result = forTest.contains(".");
		return result;
	}
}