package com.xworkz.redbus.agency;

import com.xworkz.redbus.contract.RedbusContract;

public class TravelAgency {
	
	private RedbusContract contract;
	
	public TravelAgency(RedbusContract contact) {
		System.out.println("invoked TravelAgency");
		this.contract=contact;
	}

	public void acceptBooking() {
		System.out.println("invoked acceptBooking");
		boolean warranty = contract.warranty();
		if (warranty) {
			System.out.println("bus is under warranty");
			int min = contract.minBooking();
			if (min>0 && min<=20) {
				System.out.println("can accept booking");
				
				
			}else {
				System.out.println("can not accept booking");
			}
			
			
		}else {
			System.out.println("bus is not under warranty");
		}
		
	}
	

}
