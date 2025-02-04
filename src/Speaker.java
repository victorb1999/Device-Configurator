
public class Speaker {
	private int value;
	private int noSpeakers;
	private int quality;
	private int price;

	public Speaker(int noSpeakers, int quality) {
		this.noSpeakers = noSpeakers;
		this.quality = quality;
		this.price = 20;
	}

	public int getNoSpeakers() {
		return noSpeakers;
	}

	public void setNoSpeakers(int noSpeakers) {
		this.noSpeakers = noSpeakers;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public int getValue() {
		this.calculateValue();
		return value;
	}

	private void calculateValue() {
		this.value = (this.price + (10 * this.quality)) * this.noSpeakers;

	}

}
