package domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "location")
public class Location {

	@XmlAttribute(name = "name")
	private String locationName;
	@XmlElement(name = "number")
	private String phoneNumber;
	@XmlElement(name = "weight")
	private int weighting;
	private float weightStepped;

	public Location() {
		this.weightStepped = 0;
	}

	public String toString() {
		return this.locationName + ": " + this.phoneNumber;
	}

	public float getWeightStepped() {
		return weightStepped;
	}

	public void setWeightStepped(int weightStepped) {
		this.weightStepped = weightStepped;
	}

	public int getWeighting() {
		return weighting;
	}

	public void setWeighting(int weighting) {
		this.weighting = weighting;
	}

	public void step() {
		this.weightStepped += 1.0 / weighting;
	}

}
