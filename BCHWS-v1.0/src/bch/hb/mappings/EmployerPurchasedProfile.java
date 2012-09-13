package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employer_purchased_profiles database table.
 * 
 */
@Entity
@Table(name="employer_purchased_profiles")
public class EmployerPurchasedProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EmployerPurchasedProfilePK id;

	public EmployerPurchasedProfile() {
	}

	public EmployerPurchasedProfilePK getId() {
		return this.id;
	}

	public void setId(EmployerPurchasedProfilePK id) {
		this.id = id;
	}

}