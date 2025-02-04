
public class Display {
	private int line1cm;
	private int line2cm;
	private int quality;
	private double pixelSize;
	private double price;
	private int value;

	// resolution 1080 x 2400 pixels

	public Display(int line1cm, int line2cm, int quality) {
		this.line1cm = line1cm;
		this.line2cm = line2cm;
		this.quality = quality;
		this.pixelSize = 0.0059;
		this.price = 0.00092;
	}

	public int getLine1cm() {
		return line1cm;
	}

	public void setLine1cm(int line1cm) {
		this.line1cm = line1cm;
	}

	public int getLine2cm() {
		return line2cm;
	}

	public void setLine2cm(int line2cm) {
		this.line2cm = line2cm;
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
		this.value = (int) (((this.line1cm / this.pixelSize) * (this.line2cm / this.pixelSize)) * this.price
				+ this.quality * 100);

	}
}
