package domain;

public class Location {

	private String locationName;
	private String phoneNumber;
	private int weighting;
	private static int weightStepped = 0;

	public String toString() {
		return this.locationName + ": " + this.phoneNumber;
	}

	public int getWeightStepped() {
		return weightStepped;
	}

	public void setWeightStepped(int weightStepped) {
		Location.weightStepped = weightStepped;
	}

	public int getWeighting() {
		return weighting;
	}

	public void setWeighting(int weighting) {
		this.weighting = weighting;
	}

}
