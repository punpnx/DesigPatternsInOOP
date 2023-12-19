package ex3.ex3_2;

public class PaymentController {
	private PaymentMethod paymentMethod;

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void pay() {
		paymentMethod.pay();
	}
}

