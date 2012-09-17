package bch.ws.interfaces;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bch.hb.models.FactoryInstance;

public abstract class HBDataAccessObject {

	private Session session;	
	
	public HBDataAccessObject() {		
		this.setSession(FactoryInstance.getInstance().openSession());
	}

	public Session getSession() {
		return session;
	}

	protected void setSession(Session session) {
		this.session = session;
	}

}
