package bch.ws.interfaces;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
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

	protected void beginTransaction() {
		this.setTransaction(this.getSession().beginTransaction());
	}

	private void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public boolean createRecord(Object obj) {
		boolean success = false;
		if(obj != null) {
			try {
				this.beginTransaction();
				this.getSession().save(obj);
				this.getTransaction().commit();
				success = true;
			} catch(HibernateException hex) {
				hex.printStackTrace();
				this.getTransaction().rollback();
			}
		}
		return success;
	}

	public boolean createRecord(List<Object> listObject) {
		boolean success = false;		

		if(listObject != null) {
			try {
				this.beginTransaction();

				if(!listObject.isEmpty()) {
					for(Iterator<?> i = listObject.iterator(); i.hasNext();) {					
						this.getSession().save(i.next());
					}
				}

				this.getTransaction().commit();
				success = true;
			} catch(HibernateException hex) {
				hex.printStackTrace();
				this.getTransaction().rollback();
			}
		}
		return success;
	}

	public boolean updateRecord(Object obj) {
		boolean success = false;		

		if(obj != null) {
			try {
				this.beginTransaction();
				this.getSession().update(obj);
				this.getTransaction().commit();
				success = true;
			} catch(HibernateException hex) {
				hex.printStackTrace();
				this.getTransaction().rollback();
			}
		}
		return success;
	}

	public boolean updateRecord(List<Object> listObject) {
		boolean success = false;		

		if(listObject != null) {
			try {
				this.beginTransaction();

				if(!listObject.isEmpty()) {
					for(Iterator<?> i = listObject.iterator(); i.hasNext();) {					
						this.getSession().update(i.next());
					}
				}

				this.getTransaction().commit();
				success = true;
			} catch(HibernateException hex) {
				hex.printStackTrace();
				this.getTransaction().rollback();
			}
		}
		return success;
	}

	@Override
	protected void finalize() throws Throwable {
		this.session.close();
		if(transaction != null) {
			transaction = null;
		}
	}
}
