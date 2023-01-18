package paymentServices;

public class PaypalService implements OnlinePaymentService{

	@Override
	public Double interest(double amount, int monthNumber) {
		return amount * monthNumber * 0.01;
	}
	
	@Override
	public Double paymentFee(double amount) {
		return amount * 0.02;
	}
}
