package lec15Encapsulationn;

import javax.management.loading.PrivateClassLoader;

public class GuestInfo {

	 private String  name;
	 private int contactNo;
	 private int PaymentTotal;
	 private int paid;
	 private int dues;
	 private Boolean CheckedIn;
	 private int CheckinDate;
	 private int CheckoutDate;
	private int stayplanNights;
	private char Status;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public int getPaymentTotal() {
		return PaymentTotal;
	}
	public void setPaymentTotal(int paymentTotal) {
		PaymentTotal = paymentTotal;
	}
	public int getPaid() {
		return paid;
	}
	public void setPaid(int paid) {
		this.paid = paid;
	}
	public int getDues() {
		return dues;
	}
	public void setDues(int dues) {
		this.dues = dues;
	}
	public Boolean getCheckedIn() {
		return CheckedIn;
	}
	public void setCheckedIn(Boolean checkedIn) {
		CheckedIn = checkedIn;
	}
	public int getCheckinDate() {
		return CheckinDate;
	}
	public void setCheckinDate(int checkinDate) {
		CheckinDate = checkinDate;
	}
	public int getCheckoutDate() {
		return CheckoutDate;
	}
	public void setCheckoutDate(int checkoutDate) {
		CheckoutDate = checkoutDate;
	}
	public int getStayplanNights() {
		return stayplanNights;
	}
	public void setStayplanNights(int stayplanNights) {
		this.stayplanNights = stayplanNights;
	}
	public char getStatus() {
		return Status;
	}
	public void setStatus(char status) {
		Status = status;
	}
	
	 
	 
	 
	}


