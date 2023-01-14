package model.entities;

import java.time.LocalDateTime;

public class CarRental {

	private LocalDateTime start;
	private LocalDateTime finish;

	private Vehicle vehicle;
	private Invoice invoice;

	public CarRental() {
	}

	public CarRental(LocalDateTime start2, LocalDateTime finish2, Vehicle vehicle) {
		this.start = start2;
		this.finish = finish2;
		this.vehicle = vehicle;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}
	
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
}	
