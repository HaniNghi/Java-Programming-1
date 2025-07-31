package Objects;

public class ClockTime {
	private int hours;
	private int minutes;

	public ClockTime() {
		this.hours = 0;
		this.minutes = 0;
	}

	public void add(int hours, int minutes) {
		if (hours < 0 || minutes < 0) {
			return;
		} else {
			this.hours = this.hours + hours;
			this.minutes = this.minutes + minutes;
		}
		if (this.hours > 23) {
			this.hours = this.hours - 24;
		}
		if (this.minutes > 59) {
			this.minutes = this.minutes - 60;
		}
		if (this.minutes == 60) {
			this.hours = this.hours + 1;
			this.minutes = 0;
		}
	}

	public String toString() {
		String hourString = (this.hours < 10 ? "0" : "") + this.hours;
		String minuteString = (this.minutes < 10 ? "0" : "") + this.minutes;
		return hourString + ":" + minuteString;
	}
}
