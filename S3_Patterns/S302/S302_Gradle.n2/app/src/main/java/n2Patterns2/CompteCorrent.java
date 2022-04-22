package n2Patterns2;

public class CompteCorrent {
	
	private PaymentMethod pM;
	private boolean pay;

	public CompteCorrent(PaymentMethod pM) {
		super();
		this.pM = pM;
	}

	public void processarMetodePagament() {

		pay = true;

		if (pay) {
			System.out.println("Pagar amb transferència");
			pM.makePayment();
		}
	}
}
