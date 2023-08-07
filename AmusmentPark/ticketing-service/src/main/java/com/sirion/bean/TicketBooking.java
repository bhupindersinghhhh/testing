package com.sirion.bean;

import java.time.LocalDateTime;

public class TicketBooking {
	private int ticketBookingId;
	private Customer customer;
	private Activity activity;
	private LocalDateTime dateTime;

	private static int ticketCounter = 1;

	public int getTickCounter() {
		return ticketCounter;
	}

	public void updateTicketCounter() {
		ticketCounter++;
	}

	public TicketBooking(Customer customer, Activity activity, LocalDateTime dateTime) {
		super();
		this.customer = customer;
		this.activity = activity;
		this.dateTime = dateTime;
	}

	public int getTicketBookingId() {
		return ticketBookingId;
	}

	public void setTicketBookingId(int ticketBookingId) {
		this.ticketBookingId = ticketBookingId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

}