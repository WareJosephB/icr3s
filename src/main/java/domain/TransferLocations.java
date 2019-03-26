package domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "transferLocations")
@XmlAccessorType(XmlAccessType.FIELD)
public class TransferLocations {

	private ArrayList<TransferType> transferTypes;

	public List<TransferType> getTransferTypes() {
		return transferTypes;
	}

	public void setTransferTypes(List<TransferType> transferTypes) {
		this.transferTypes = (ArrayList<TransferType>) transferTypes;
	}

	public String getCallCentre(String requestType) {
		for (TransferType type : transferTypes) {
			if (type.getType().equals(requestType)) {
				return type.getCallCentre();
			}
		}
		return "No centres found to deal with that request type.";
	}

	public String toString() {
		return this.getTransferTypes().get(0).getCallCentre();
	}

}
