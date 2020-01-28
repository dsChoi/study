package com.setin.study.objects.chapter01.ticket_03;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice extends Ticket {
	private Long amount;
	private List<Ticket> tickets = new ArrayList<>();

	public TicketOffice(Long amount, List<Ticket> tickets) {
		this.amount = amount;
		this.tickets = tickets;
	}

	private Ticket getTicket() {
		return tickets.remove(0);
	}

	private void minusAmount(Long amount) {
		this.amount -= amount;
	}

	private void plusAmount(Long amount) {
		this.amount += amount;
	}


	public void sellTicketTo(Audience audience){
	plusAmount(audience.buy(getTicket()));
	}
}
