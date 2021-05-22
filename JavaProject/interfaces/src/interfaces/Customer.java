package interfaces;

public class Customer {
	private String firstName;
	private String lastName;
	
	public Customer() {
		
	}
	public Customer(String name,String surname) {  
		set_Surname(surname);
		set_Name(name);
		}
	
	public String get_Name() {
		return firstName; 
		}
	
	public void set_Name(String name) { 
		this.firstName=name; 
		}
	
	public String get_Surname() {
		return lastName; 
		}
	
	public void set_Surname(String surname) { 
		this.lastName=surname; 
		}

}
