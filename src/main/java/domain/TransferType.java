package domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "transferType")
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
		nextCallCentre.step(getTotalWeighting());
		return nextCallCentre.toString();
	}
	
	private int getTotalWeighting() {
		int i = 0;
		for (Location location : locations) {
			i += location.getWeighting();
		}
		return Math.max(i, 1); //prevent div by 0
	}


}
