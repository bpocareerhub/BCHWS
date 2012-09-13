package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the transactions database table.
 * 
 */
@Entity
@Table(name="transactions")
public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transaction_id")
	private int transactionId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Column(name="new_value")
	private int newValue;

	@Column(name="original_value")
	private int originalValue;

	@Column(name="transaction_by_user_id")
	private int transactionByUserId;

	@Column(name="transaction_type_id")
	private int transactionTypeId;

	@Column(name="transaction_value")
	private int transactionValue;

	@Column(name="transaction_with")
	private int transactionWith;

	public Transaction() {
	}

	public int getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public int getNewValue() {
		return this.newValue;
	}

	public void setNewValue(int newValue) {
		this.newValue = newValue;
	}

	public int getOriginalValue() {
		return this.originalValue;
	}

	public void setOriginalValue(int originalValue) {
		this.originalValue = originalValue;
	}

	public int getTransactionByUserId() {
		return this.transactionByUserId;
	}

	public void setTransactionByUserId(int transactionByUserId) {
		this.transactionByUserId = transactionByUserId;
	}

	public int getTransactionTypeId() {
		return this.transactionTypeId;
	}

	public void setTransactionTypeId(int transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}

	public int getTransactionValue() {
		return this.transactionValue;
	}

	public void setTransactionValue(int transactionValue) {
		this.transactionValue = transactionValue;
	}

	public int getTransactionWith() {
		return this.transactionWith;
	}

	public void setTransactionWith(int transactionWith) {
		this.transactionWith = transactionWith;
	}

}