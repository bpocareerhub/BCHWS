package bch.ws.interfaces;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bch.hb.models.FactoryInstance;

public abstract class HBDataAccessObject {

	private Session session;
	private Transaction transaction;
	
	public HBDataAccessObject() {		
		this.setSession(FactoryInstance.getInstance().openSession());
	}

	public Session getSession() {
		return session;
	}

	protected void setSession(Session session) {
		this.session = session;
	}
	
	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	@Override
	protected void finalize() throws Throwable {
		this.session.close();
		if(transaction != null) {
			transaction = null;
		}
	}
	
}
