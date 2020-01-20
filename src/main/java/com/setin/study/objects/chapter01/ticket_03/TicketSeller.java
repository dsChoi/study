package com.setin.study.objects.chapter01.ticket_03;

public class TicketSeller {

	private TicketOffice ticketOffice;

	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}



	public void sellTo(Audience audience){
		ticketOffice.sellTicketTo(audience);
	}


}
