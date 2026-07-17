package com.multithreading;

class BookMyShow {

	int total_available_Tickets = 10;

	synchronized void bookMyTicket(String name, int tickets) {

		if (total_available_Tickets >= tickets) {
			System.out.println(tickets + " Tickets has booked Successfully for mr." + name);
			total_available_Tickets = total_available_Tickets - tickets;
			System.out.println("Remaining Tickets Count is : " + total_available_Tickets);
		} else {
			System.err.println("Sorry !! ALl Tickets has been sold out !!" + name);
			System.err.println("Remaining Tickets Count is : " + total_available_Tickets);
		}

	}

}

class Customer extends Thread {

	BookMyShow bms;
	String customerName;
	int tickets;

	public Customer(BookMyShow bms, String customerName, int tickets) {
		super();
		this.bms = bms;
		this.customerName = customerName;
		this.tickets = tickets;
	}

	@Override
	public void run() {
		bms.bookMyTicket(customerName, tickets);
	}

}

public class TestBookMyShowDemo {

	public static void main(String[] args) {
		BookMyShow bms = new BookMyShow();

		Customer c1 = new Customer(bms, "Srikanth", 6);
		c1.start();

		Customer c2 = new Customer(bms, "Vinay", 3);
		c2.start();

		Customer c3 = new Customer(bms, "Manu", 3);
		c3.start();

	}

}
