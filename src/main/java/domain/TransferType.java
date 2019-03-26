package domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class TransferType {

	private String type;
	private ArrayList<Location> locations;

	public String getType() {
		return type;
	}

	public void setType(String transferType) {
		this.type = transferType;
	}

	public String getCallCentre() {
		Location nextCallCentre = locations.stream().min(Comparator.comparing(Location::getWeightStepped))
				.orElseThrow(NoSuchElementException::new);
		nextCallCentre.setWeightStepped(nextCallCentre.getWeightStepped() + nextCallCentre.getWeighting());
		return nextCallCentre.toString();
	}

}
