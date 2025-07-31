package ClassesAndObjects2;

import java.util.ArrayList;

public class Crew {
	private ArrayList<Sailor> sailotList = new ArrayList<Sailor>();

	public Crew() {

	}

	public void addCrewMember(Sailor sailor) {
		this.sailotList.add(sailor);
	}

	public String toString() {
		String output = "";
		for (Sailor sailorObject : this.sailotList) {
			output += sailorObject.getName() + " (" + sailorObject.getEmail() + ")" + "\n";
		}
		return output;
	}
}
