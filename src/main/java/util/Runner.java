package util;

import domain.TransferLocations;

public class Runner {

	public static void main(String[] args) {

		TransferLocations manager = XmlParser.parse("src/main/resources/Weightings.xml");

		System.out.println("Lost and Stolen:");
		for (int i = 0; i < 13; i++) {
			System.out.println(manager.getCallCentre("lost and stolen"));
		}

		System.out.println("Fraud:");
		for (int i = 0; i < 5; i++) {
			System.out.println(manager.getCallCentre("fraud"));

		}
	}

}
