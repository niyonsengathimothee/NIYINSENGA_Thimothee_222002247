package MYEntities;

public class Payment {

private int id;
private String Paymentmethod;
private String Paymentamount;
private String Paymentstatus;
private String Paymentdate;

public Payment() {}
public Payment(int id, String Paymentmethod, String Paymentamount, String Paymentstatus, String Paymentdate) {
	super();
	this.id = id;
	this.Paymentmethod= Paymentmethod;
	this.Paymentamount=Paymentamount;
	this.Paymentstatus=Paymentstatus;
	this.Paymentdate= Paymentdate;
}
public String getPaymentmethod() {
	return Paymentmethod;
}
public void setPaymentmethod(String paymentmethod) {
	Paymentmethod = paymentmethod;
}
public String getPaymentamount() {
	return Paymentamount;
}
public void setPaymentamount(String paymentamount) {
	Paymentamount = paymentamount;
}
public String getPaymentstatus() {
	return Paymentstatus;
}
public void setPaymentstatus(String paymentstatus) {
	Paymentstatus = paymentstatus;
}
public String getPaymentdate() {
	return Paymentdate;
}
public void setPaymentdate(String paymentdate) {
	Paymentdate = paymentdate;
}
}