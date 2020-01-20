package com.setin.study.objects.chapter01.ticket_03;

public class Bag {
	private Long amount;
	private Invitation invitation;
	private Ticket ticket;

	public Long hold(Ticket ticket){
	    if(hasInvitation()){
	        setTicket(ticket);
	        return 0L;

        }else {
	        setTicket(ticket);
	        minusAmount(ticket.getFee());
	        return ticket.getFee();
        }
    }

	private boolean hasInvitation(){
		return invitation != null;
	}

	public boolean hasTicket(){
		return ticket != null;
	}

	private void setTicket(Ticket ticket){
		this.ticket = ticket;
	}

	private void minusAmount(Long amount){
		this.amount -= amount;
	}

	private void plusAmount(Long amount){
		this.amount += amount;
	}

	private Bag(Long amount) {
		this.amount = amount;
	}

	public Bag(Long amount, Invitation invitation) {
		this.amount = amount;
		this.invitation = invitation;
	}
}
