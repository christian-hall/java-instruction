package business;

//variables
public class Contact {
	private String name;
	private String email;
	private String phone;
	
//fully loaded constructor
	public Contact(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
//empty constructor
	public Contact() {
		super();
	}
//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
//to string
	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

}
