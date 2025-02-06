
public class Extra {
	private boolean screenProtector;
	private int priceScreenProtector;
	private boolean charger;
	private int priceCharger;
	private boolean extraWarranty;
	private int noYears;
	private int priceExtraWarranty;
	private int value;

	public Extra(boolean screenProtector, boolean charger, boolean extraWarranty, int noYears) {
		this.screenProtector = screenProtector;
		this.charger = charger;
		this.extraWarranty = extraWarranty;
		this.noYears = noYears;
		this.priceScreenProtector = 20;
		this.priceCharger = 200;
		this.priceExtraWarranty = 200;
	}

	public boolean isScreenProtector() {
		return screenProtector;
	}

	public void setScreenProtector(boolean screenProtector) {
		this.screenProtector = screenProtector;
	}

	public boolean isCharger() {
		return charger;
	}

	public void setCharger(boolean charger) {
		this.charger = charger;
	}

	public boolean isExtraWarranty() {
		return extraWarranty;
	}

	public void setExtraWarranty(boolean extraWarranty) {
		this.extraWarranty = extraWarranty;
		if (!this.extraWarranty) {
			this.noYears = 0;
		}
	}

	public int getNoYears() {
		return noYears;
	}

	public void setNoYears(int noYears) {
		this.noYears = noYears;
	}

	public int getValue() {
		this.calculateValue();
		return value;
	}

	private void calculateValue() {
		this.value = 0;
		if (this.screenProtector) {
			this.value += this.priceScreenProtector;
		}

		if (this.charger) {
			this.value += this.priceCharger;
		}

		if (this.extraWarranty) {
			this.value += this.priceExtraWarranty * this.noYears;
		}

	}

}
