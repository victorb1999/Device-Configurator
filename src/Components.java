
public class Components {
	private boolean nfc;
	private int priceNFC;
	private boolean wirellesCharging;
	private int priceWifiC;
	private boolean fastCharging;
	private int priceFC;
	private int memory;
	private int priceMemory;
	private int memoryRAM;
	private int priceMemoryRAM;
	private int priceProcessor;
	private int battery;
	private int priceBattery;
	private int value;

	public Components(boolean nfc, boolean wirellesCharging, boolean fastCharging, int memory, int memoryRAM,
			int battery) {
		this.nfc = nfc;
		this.wirellesCharging = wirellesCharging;
		this.fastCharging = fastCharging;
		this.memory = memory;
		this.memoryRAM = memoryRAM;
		this.battery = battery;
		this.priceNFC = 20;
		this.priceWifiC = 40;
		this.priceFC = 40;
		this.priceMemory = 8;
		this.priceMemoryRAM = 20;
		this.priceProcessor = 80;
		this.priceBattery = 2;
	}

	public boolean isNfc() {
		return nfc;
	}

	public void setNfc(boolean nfc) {
		this.nfc = nfc;
	}

	public boolean isWirellesCharging() {
		return wirellesCharging;
	}

	public void setWirellesCharging(boolean wirellesCharging) {
		this.wirellesCharging = wirellesCharging;
	}

	public boolean isFastCharging() {
		return fastCharging;
	}

	public void setFastCharging(boolean fastCharging) {
		this.fastCharging = fastCharging;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getMemoryRAM() {
		return memoryRAM;
	}

	public void setMemoryRAM(int memoryRAM) {
		this.memoryRAM = memoryRAM;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int getValue() {
		this.calculateValue();
		return value;
	}

	private void calculateValue() {
		this.value = 0;
		if (this.nfc) {
			this.value += this.priceNFC;
		}
		if (this.wirellesCharging) {
			this.value += this.priceWifiC;
		}

		if (this.fastCharging) {
			this.value += this.priceFC;
		}
		System.out.println(value + " value before sum");
		this.value += this.memory * this.priceMemory + this.memoryRAM * this.priceMemoryRAM + this.priceProcessor
				+ this.battery / 100 * this.priceBattery;
		System.out.println(value + " value after sum");
	}
}
