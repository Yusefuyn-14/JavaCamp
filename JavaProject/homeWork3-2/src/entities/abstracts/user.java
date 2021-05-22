package entities.abstracts;

public class user {
	private int userID;
	private String firstName;
	private String lastName;
	
	public user() {
		super();
	}
	
	public user(int userID, String firstName, String lastName) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
