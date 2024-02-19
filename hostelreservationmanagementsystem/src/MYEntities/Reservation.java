package MYEntities;

public class Reservation {
	private int Reservationid;
	private String Customerid;
	private String Checkindate;
	private String Checkoutdate;
	private String Bookingdate;
	private String Totalprice;
	
	
	public Reservation() {}
	public Reservation(int Reservationid, String Customerid, String Checkindate ,String Checkoutdate,String Bookingdate,String Totalprice) {
		super();
		this. Reservationid= Reservationid;
		this.Customerid =Customerid;
		this.Checkindate = Checkindate;
		this.Bookingdate= Bookingdate;
		this.Totalprice= Totalprice;

		
		
	}
	public int getReservationid() {
		return Reservationid;
	}
	public void setReservationid(int reservationid) {
		Reservationid = reservationid;
	}
	public String getCustomerid() {
		return Customerid;
	}
	public void setCustomerid(String customerid) {
		Customerid = customerid;
	}
	public String getCheckindate() {
		return Checkindate;
	}
	public void setCheckindate(String checkindate) {
		Checkindate = checkindate;
	}
	public String getCheckoutdate() {
		return Checkoutdate;
	}
	public void setCheckoutdate(String checkoutdate) {
		Checkoutdate = checkoutdate;
	}
	public String getBookingdate() {
		return Bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		Bookingdate = bookingdate;
	}
	public String getTotalprice() {
		return Totalprice;
	}
	public void setTotalprice(String totalprice) {
		Totalprice = totalprice;
	}

}
