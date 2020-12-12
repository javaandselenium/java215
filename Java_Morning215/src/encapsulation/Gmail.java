package encapsulation;

public class Gmail {
	
	private String emailId="bharani@gmail.com";
	private int password=1234;
	
	public String getEmailId() {
		return emailId;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
