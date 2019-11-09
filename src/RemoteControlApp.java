import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String response;
		do {
			System.out.print("To begin, turn on the remote control:");
			response = input.next();
		} while (!response.equals("ON"));
		System.out.println("TURNING ON...");
		while (!response.equals("OFF")) {
			response = input.next();
			switch (response) {
				case "0":
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
				case "8":
				case "9":
					pressButton();
					break;
				case "OFF":
					break;
				default:
					System.out.println("Command not recognized");
			}
		}
		input.close();
		System.out.println("TURNING OFF...");
	}

	public static void pressButton() {
		System.out.println("BOOP!");
	}
}
