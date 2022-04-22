package n2Patterns2;

public class PayPal {

	private PaymentMethod pM;
	private boolean pay;

	public PayPal(PaymentMethod pM) {
		super();
		this.pM = pM;
	}

	public void processarMetodePagament() {

		pay = true;

		if (pay) {
			System.out.println("Pagar amb PayPal");
			pM.makePayment();
		}
	}
}
