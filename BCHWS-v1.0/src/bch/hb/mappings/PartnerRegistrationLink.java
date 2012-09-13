package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the partner_registration_links database table.
 * 
 */
@Entity
@Table(name="partner_registration_links")
public class PartnerRegistrationLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="registration_id")
	private int registrationId;

	@Column(name="client_id")
	private int clientId;

	public PartnerRegistrationLink() {
	}

	public int getRegistrationId() {
		return this.registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

}