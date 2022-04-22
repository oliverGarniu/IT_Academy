package n2Patterns2;

public class CreditCard {

	private PaymentMethod pM;
	private boolean pay;

	public CreditCard(PaymentMethod pM) {
		super();
		this.pM = pM;
	}

	public void processarMetodePagament() {

		pay = true;

		if (pay) {
			System.out.println("Pagar amb targeta");
			pM.makePayment();
		}
	}

}
