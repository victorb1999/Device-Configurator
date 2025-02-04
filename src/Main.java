import java.util.Scanner;

public class Main {
	private static boolean verifyAnswer(Scanner sc) {
		String answer = sc.nextLine();
		while (!answer.equals("true") && !answer.equals("false")) {
			System.out.println("Insert a valid option (true or false)");
			answer = sc.nextLine();
		}
		if (answer.equals("true")) {
			return true;
		} else {
			return false;
		}
	}

	private static int verifyInt(Scanner sc) {
		int userInput;
		while (true) {
			try {
				userInput = Integer.parseInt(sc.nextLine());
				while (userInput < 1) {
					System.out.println("Enter an integer above 0.");
					userInput = Integer.parseInt(sc.nextLine());
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid integer.");
			}
		}

		return userInput;
	}

	private static void showPrice(Device myDevice) {
		System.out.println("Updated price: " + myDevice.getValue() + " lei.");
	}

	private static void showComands() {
		System.out.println("help - show comands");
		System.out.println("editspeaker - edit the number of speakers");
		System.out.println("editspeakerquality - edit the quality of speaker");
		System.out.println("editcameras - edit the number of cameras");
		System.out.println("editmp - edit the number of MP for camera");
		System.out.println("editselfie - edit if you want a selfie camera or not");
		System.out.println("editmpselfie - edit the number of MP for selfie camera");
		System.out.println("edithorizontal - edit the horizontal size");
		System.out.println("editvertical - edit the vertical size");
		System.out.println("editdisplayquality - edit the display quality");
		System.out.println("editnfc - edit if you want NFC or not");
		System.out.println("editwirelles - edit if you want wirelles charging or not");
		System.out.println("editfast - edit if you want fast charging or not");
		System.out.println("editmemory - edit the memory size");
		System.out.println("editram - edit the RAM size");
		System.out.println("editbattery - edit the battery size");
		System.out.println("editscreenprotector - edit if you want screen protection or not");
		System.out.println("editcharger - edit if you want charger or not");
		System.out.println("editextrawarranty - edit if you want extra warranty or not");
		System.out.println("edityears - edit the number of years for extra warranty");
		System.out.println("quit - exit");
	}

	private static Device createInitialDevice(Scanner sc) {
		System.out.println("Insert the number of speakers: ");
		int noSpeakers = verifyInt(sc);

		System.out.println(
				"Insert the quality of speakers from 1 to 3. 1 represents the standard version and 3 represents the best version.");
		int qualitySpearker = verifyInt(sc);
		while (qualitySpearker < 1 || qualitySpearker > 3) {
			System.out.println("Insert a valid option!");
			qualitySpearker = verifyInt(sc);
		}

		System.out.println("Insert the number of cameras: ");
		int noCameras = verifyInt(sc);

		System.out.println("Insert the number of MP per camera: ");
		int noMp = verifyInt(sc);

		System.out.println("Do you want a selfie camera ? true/false");
		boolean selfie = verifyAnswer(sc);
		int noMPSelfie;
		if (!selfie) {
			noMPSelfie = 0;
		} else {
			System.out.println("Insert the number of MP for selfie: ");
			noMPSelfie = verifyInt(sc);
		}

		System.out.println("Insert the size for the horizontal side(in cm): ");
		int line1cm = verifyInt(sc);

		System.out.println("Insert the size for the vertical side(in cm): ");
		int line2cm = verifyInt(sc);

		System.out.println(
				"Insert the quality of display from 1 to 3. 1 represents the standard version and 3 represents the best version.");
		int qualityDisplay = verifyInt(sc);
		while (qualityDisplay < 1 || qualityDisplay > 3) {
			System.out.println("Insert a valid option!");
			qualityDisplay = verifyInt(sc);
		}

		System.out.println("Do you want NFC? true/false");
		boolean nfc = verifyAnswer(sc);

		System.out.println("Do you want wirelles charging? true/false");
		boolean wirellesCharging = verifyAnswer(sc);

		System.out.println("Do you want fast charging? true/false");
		boolean fastCharging = verifyAnswer(sc);

		System.out.println("Insert the memory size(in GB): ");
		int memory = verifyInt(sc);

		System.out.println("Insert the RAM size(in GB): ");
		int memoryRAM = verifyInt(sc);

		System.out.println("Insert the battery size(in mAh): ");
		int battery = verifyInt(sc);

		System.out.println("Do you want a screen protection? true/false");
		boolean screenProtector = verifyAnswer(sc);

		System.out.println("Do you want a charger? true/false");
		boolean charger = verifyAnswer(sc);

		System.out.println("Do you want extra warranty? true/false");
		boolean extraWarranty = verifyAnswer(sc);
		int noYears;
		if (!extraWarranty) {
			noYears = 0;
		} else {
			System.out.println("Insert how many years(max. 5 years): ");
			noYears = verifyInt(sc);
			while (noYears < 1 || noYears > 5) {
				System.out.println("Insert a valid option!");
				noYears = verifyInt(sc);
			}
		}

		Device myD = new Device(noSpeakers, qualitySpearker, noCameras, noMp, selfie, noMPSelfie, line1cm, line2cm,
				qualityDisplay, nfc, wirellesCharging, fastCharging, memory, memoryRAM, battery, screenProtector,
				charger, extraWarranty, noYears);
		return myD;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome! This is a device configurator and you choose how your new device will be!");
		System.out.println(
				"First of all, we will create your device step-by-step as you wish. After we create the device, we will show you the price.");
		System.out.println("If the price is not according to your expectations and you want to make changes,");
		System.out.println("you will have a helpful list through which we will make the changes you want!");
		System.out.println("Let's start");
		Device myDevice = createInitialDevice(sc);
		System.out.println("Your device has been set up!");
		System.out.println("Price: " + myDevice.getValue() + " lei");

		boolean running = true;
		System.out.println("Do you want to make any changes? Yes: text \"help\"  No: text \"quit\"");

		while (running) {
			String command = sc.nextLine();

			switch (command) {
			case "help":
				showComands();
				break;
			case "editspeaker":
				System.out.println("Insert:");
				myDevice.theSpeaker.setNoSpeakers(verifyInt(sc));
				showPrice(myDevice);
				break;
			case "editspeakerquality":
				System.out.println("Insert:");
				int value = verifyInt(sc);
				while (value < 1 || value > 3) {
					System.out.println("Insert a valid option from 1 to 3");
					value = verifyInt(sc);
				}
				myDevice.theSpeaker.setQuality(value);
				showPrice(myDevice);
				break;
			case "editcameras":
				System.out.println("Insert:");
				myDevice.theCamera.setNoCameras(verifyInt(sc));
				showPrice(myDevice);
				break;
			case "editmp":
				System.out.println("Insert:");
				myDevice.theCamera.setNoMP(verifyInt(sc));
				showPrice(myDevice);
				break;
			case "editselfie":
				System.out.println("Insert:");
				boolean togo = verifyAnswer(sc);

				myDevice.theCamera.setSelfie(togo);

				if (togo) {
					System.out.println("Insert the number of MP for selfie: ");
					myDevice.theCamera.setNoMPSelfie(verifyInt(sc));
				}
				showPrice(myDevice);
				break;
			case "editmpselfie":
				System.out.println("Insert:");
				myDevice.theCamera.setNoMPSelfie(verifyInt(sc));
				showPrice(myDevice);
				break;
			case "edithorizontal":
				System.out.println("Insert:");
				myDevice.theDisplay.setLine1cm(verifyInt(sc));
				showPrice(myDevice);
				break;
			case "editvertical":
				System.out.println("Insert:");
				myDevice.theDisplay.setLine2cm(verifyInt(sc));
				showPrice(myDevice);
				break;
			case "editdisplayquality":
				System.out.println("Insert:");
				value = verifyInt(sc);
				while (value < 1 || value > 3) {
					System.out.println("Insert a valid option from 1 to 3");
					value = verifyInt(sc);
				}
				myDevice.theDisplay.setQuality(value);
				showPrice(myDevice);
				break;
			case "editnfc":
				System.out.println("Insert:");
				togo = verifyAnswer(sc);

				myDevice.theComponents.setNfc(togo);
				showPrice(myDevice);
				break;
			case "editwirelles":
				System.out.println("Insert:");
				togo = verifyAnswer(sc);

				myDevice.theComponents.setWirellesCharging(togo);
				showPrice(myDevice);
				break;
			case "editfast":
				System.out.println("Insert:");
				togo = verifyAnswer(sc);

				myDevice.theComponents.setFastCharging(togo);
				showPrice(myDevice);
				break;
			case "editmemory":
				System.out.println("Insert:");
				myDevice.theComponents.setMemory(verifyInt(sc));
				showPrice(myDevice);
				break;
			case "editram":
				System.out.println("Insert:");
				myDevice.theComponents.setMemoryRAM(verifyInt(sc));
				showPrice(myDevice);
				break;
			case "editbattery":
				System.out.println("Insert:");
				myDevice.theComponents.setBattery(verifyInt(sc));
				showPrice(myDevice);
				break;
			case "editscreenprotector":
				System.out.println("Insert:");
				togo = verifyAnswer(sc);

				myDevice.theExtra.setScreenProtector(togo);
				showPrice(myDevice);
				break;
			case "editcharger":
				System.out.println("Insert:");
				togo = verifyAnswer(sc);

				myDevice.theExtra.setCharger(togo);
				showPrice(myDevice);
				break;
			case "editextrawarranty":
				System.out.println("Insert:");
				togo = verifyAnswer(sc);

				myDevice.theExtra.setExtraWarranty(togo);

				if (togo) {
					System.out.println("Insert the years: ");
					myDevice.theExtra.setNoYears(verifyInt(sc));
				}
				showPrice(myDevice);
				break;
			case "edityears":
				System.out.println("Insert: ");
				myDevice.theExtra.setNoYears(verifyInt(sc));
				showPrice(myDevice);
				break;
			case "quit":
				System.out.println("Exit");
				sc.close();
				running = false;
				break;
			default:
				System.out.println("Insert a valid option!");
				System.out.println("Try again!");
			}

		}
	}
}
