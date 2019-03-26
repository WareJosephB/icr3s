package util;

import domain.TransferLocations;

public class Runner {

	public static void main(String[] args) {

		TransferLocations manager = XmlParser.parse("src/main/resources/Weightings.xml");
		
		for (int i = 0; i < 13; i++) {
			System.out.println(manager.getCallCentre("lost and stolen"));
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(manager.getCallCentre("fraud"));

		}
	}

}
