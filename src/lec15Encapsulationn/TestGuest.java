package lec15Encapsulationn;

import java.io.ObjectInputStream.GetField;

public class TestGuest {

	public static void main(String[] args) {
	GuestInfo guestInfo = new GuestInfo();
	guestInfo.setName("Dipon");
	guestInfo.setContactNo(01717074666);
	guestInfo.setCheckoutDate(12-16-2021);
	guestInfo.setCheckoutDate(12-18-2021);
	guestInfo.setPaymentTotal(14000);
	guestInfo.setPaid(3500);
	guestInfo.setDues(10500);
	guestInfo.setStayplanNights(2);
	guestInfo.getStatus();
	
	GuestInfo guestInfo2 = new GuestInfo();
	guestInfo2.setName("Shahin" );
	guestInfo2.setContactNo(0171707555);
	guestInfo2.setCheckoutDate(12-16-2021);
	guestInfo2.setCheckoutDate(12-18-2021);
	guestInfo2.setPaymentTotal(7000);
	guestInfo2.setPaid(2000);
	guestInfo2.setDues(5000);
	guestInfo2.setStayplanNights(2);
	guestInfo2.getStatus();
	
	System.out.println("Guest Name: " + guestInfo.getName() + "Contact No:");
	

	}

}
