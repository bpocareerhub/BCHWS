package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the employer_purchased_profiles database table.
 * 
 */
@Embeddable
public class EmployerPurchasedProfilePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="purchase_id")
	private int purchaseId;

	@Column(name="profile_user_id")
	private int profileUserId;

	@Column(name="transaction_id")
	private int transactionId;

	@Column(name="purchased_by_user_id")
	private int purchasedByUserId;

	@Column(name="client_id")
	private int clientId;

	public EmployerPurchasedProfilePK() {
	}
	public int getPurchaseId() {
		return this.purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public int getProfileUserId() {
		return this.profileUserId;
	}
	public void setProfileUserId(int profileUserId) {
		this.profileUserId = profileUserId;
	}
	public int getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getPurchasedByUserId() {
		return this.purchasedByUserId;
	}
	public void setPurchasedByUserId(int purchasedByUserId) {
		this.purchasedByUserId = purchasedByUserId;
	}
	public int getClientId() {
		return this.clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EmployerPurchasedProfilePK)) {
			return false;
		}
		EmployerPurchasedProfilePK castOther = (EmployerPurchasedProfilePK)other;
		return 
			(this.purchaseId == castOther.purchaseId)
			&& (this.profileUserId == castOther.profileUserId)
			&& (this.transactionId == castOther.transactionId)
			&& (this.purchasedByUserId == castOther.purchasedByUserId)
			&& (this.clientId == castOther.clientId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.purchaseId;
		hash = hash * prime + this.profileUserId;
		hash = hash * prime + this.transactionId;
		hash = hash * prime + this.purchasedByUserId;
		hash = hash * prime + this.clientId;
		
		return hash;
	}
}