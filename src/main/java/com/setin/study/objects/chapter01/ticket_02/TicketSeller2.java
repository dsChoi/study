package com.setin.study.objects.chapter01.ticket_02;

public class TicketSeller2 {

	private TicketOffice ticketOffice;

	public TicketSeller2(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}



	public void sellTo(Audience audience){
		ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
	}


}
