package MYEntities;

public class Customer {
	private int id;
	private String Paymentid;
	private String fname;
	private String lname;
	private String email;
	private String telephone;
	public Customer() {}
	public Customer(int id,String paymentid, String fname, String lname, String email, String telephone) {
		super();
		this.id = id;
		this.Paymentid=paymentid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.telephone = telephone;
	}
	public String getPaymentid() {
		return Paymentid;
	}
	public void setPaymentid(String paymentid) {
		Paymentid = paymentid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	}

