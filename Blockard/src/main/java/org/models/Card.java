package org.models;

public class Card {
	long card_number;
	public long getCard_number() {
		return card_number;
	}
	public void setCard_number(long card_number) {
		this.card_number = card_number;
	}
	public long getCust_id() {
		return cust_id;
	}
	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}
	public boolean isActive_status() {
		return active_status;
	}
	public void setActive_status(boolean active_status) {
		this.active_status = active_status;
	}
	public long getBalance_outstanding() {
		return balance_outstanding;
	}
	public void setBalance_outstanding(long balance_outstanding) {
		this.balance_outstanding = balance_outstanding;
	}
	long cust_id;
	boolean active_status;
	long balance_outstanding;
	

}
