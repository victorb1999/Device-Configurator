
public class Camera {
	private int noCameras;
	private int noMP;
	private boolean selfie;
	private int noMPSelfie;
	private int value;
	private int price;

	public Camera(int noCameras, int noMP, boolean selfie, int noMPSelfie) {
		this.noCameras = noCameras;
		this.noMP = noMP;
		this.selfie = selfie;
		this.noMPSelfie = noMPSelfie;
		this.price = 40;
	}

	public int getNoCameras() {
		return noCameras;
	}

	public void setNoCameras(int noCameras) {
		this.noCameras = noCameras;
	}

	public int getNoMP() {
		return noMP;
	}

	public void setNoMP(int noMP) {
		this.noMP = noMP;
	}

	public boolean isSelfie() {
		return selfie;
	}

	public void setSelfie(boolean selfie) {
		this.selfie = selfie;
		if (!this.selfie) {
			this.noMPSelfie = 0;
		}
	}

	public int getNoMPSelfie() {
		return noMPSelfie;
	}

	public void setNoMPSelfie(int noMPSelfie) {
		this.noMPSelfie = noMPSelfie;
	}

	public int getValue() {
		this.calculateValue();
		return value;
	}

	private void calculateValue() {
		this.value = this.noMP * this.price * this.noCameras + this.noMPSelfie * this.price;

	}

}
