package paymentServices;

public interface OnlinePaymentService {
	
	public Double paymentFee(double amount); //public é reduntante, pois todo método é publico em uma interface
	public Double interest(double amount, int months);
	
}
