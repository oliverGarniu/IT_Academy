package n2Patterns2;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean validChoice = false;

		class PaymentGateway implements PaymentMethod {

			@Override
			public void makePayment() {

				System.out.println("Procedim a realitzar el pagament.");
				System.out.println("Gràcies per la seva visita i fins la propera!!");

			}
		}
		PaymentGateway pG = new PaymentGateway();

		CreditCard creditCard = new CreditCard(pG);
		PayPal payPal = new PayPal(pG);
		CompteCorrent compteCorrent = new CompteCorrent(pG);

		while (!validChoice) {

			System.out.println("\n== PAYMENT METHOD ==");
			System.out.println("1. Credit Card.");
			System.out.println("2. PayPal.");
			System.out.println("3. Transfer.");

			int metodeP = sc.nextInt();
			sc.close();
			
			if (metodeP == 1) {
				creditCard.processarMetodePagament();
				validChoice = true;
			} else if (metodeP == 2) {
				payPal.processarMetodePagament();
				validChoice = true;
			} else if (metodeP == 3) {
				compteCorrent.processarMetodePagament();
				validChoice = true;
			} else {
				System.out.println("Invalid Choice, try again please.");
				System.out.println("");
			}
		}
	}
}
