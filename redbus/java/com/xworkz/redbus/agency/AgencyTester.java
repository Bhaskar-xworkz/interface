package com.xworkz.redbus.agency;

import com.xworkz.redbus.contract.RedbusContract;
import com.xworkz.redbus.vrl.RedbusContractImplementor;

public class AgencyTester {

	public static void main(String[] args) {
		RedbusContract redBus = new RedbusContractImplementor();
		TravelAgency agency = new TravelAgency(redBus);
		agency.acceptBooking();

	}

}
