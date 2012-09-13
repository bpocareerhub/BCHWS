package bch.ws.interfaces;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bch.hb.models.FactoryInstance;

public abstract class HBDataAccessObject {

	private Session session;
	private Transaction transaction;
	
	public HBDataAccessObject() {
		transaction = null;
		this.setSession(FactoryInstance.getInstance().openSession());
	}

	public void createTransaction() {
		this.setTransaction(this.getSession().beginTransaction());
	}
	
	public void commitTransaction() {
		this.getTransaction().commit();
	}
	
	protected Session getSession() {
		return session;
	}

	protected void setSession(Session session) {
		this.session = session;
	}

	protected Transaction getTransaction() {
		return transaction;
	}

	protected void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
}
