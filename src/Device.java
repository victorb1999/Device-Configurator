
public class Device {
	Speaker theSpeaker;
	Camera theCamera;
	Display theDisplay;
	Components theComponents;
	Extra theExtra;
	private int value;

	public Device(int noSpeakers, int qualitySpearker, int noCameras, int noMp, boolean selfie, int noMPSelfie,
			int line1cm, int line2cm, int qualityDisplay, boolean nfc, boolean wirellesCharging, boolean fastCharging,
			int memory, int memoryRAM, int battery, boolean screenProtector, boolean charger, boolean extraWarranty,
			int noYears) {
		this.theSpeaker = new Speaker(noSpeakers, qualitySpearker);
		this.theCamera = new Camera(noCameras, noMp, selfie, noMPSelfie);
		this.theDisplay = new Display(line1cm, line2cm, qualityDisplay);
		this.theComponents = new Components(nfc, wirellesCharging, fastCharging, memory, memoryRAM, battery);
		this.theExtra = new Extra(screenProtector, charger, extraWarranty, noYears);
	}

	public int getValue() {
		this.calculateValue();
		return this.value;
	}

	private void calculateValue() {
		this.value = this.theSpeaker.getValue() + this.theCamera.getValue() + this.theDisplay.getValue()
				+ this.theComponents.getValue() + this.theExtra.getValue();
	}

}
