package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the account_type_rights database table.
 * 
 */
@Embeddable
public class AccountTypeRightPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="account_type_id")
	private int accountTypeId;

	@Column(name="module_id")
	private int moduleId;

	@Column(name="module_rights_id")
	private int moduleRightsId;

	public AccountTypeRightPK() {
	}
	public int getAccountTypeId() {
		return this.accountTypeId;
	}
	public void setAccountTypeId(int accountTypeId) {
		this.accountTypeId = accountTypeId;
	}
	public int getModuleId() {
		return this.moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public int getModuleRightsId() {
		return this.moduleRightsId;
	}
	public void setModuleRightsId(int moduleRightsId) {
		this.moduleRightsId = moduleRightsId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AccountTypeRightPK)) {
			return false;
		}
		AccountTypeRightPK castOther = (AccountTypeRightPK)other;
		return 
			(this.accountTypeId == castOther.accountTypeId)
			&& (this.moduleId == castOther.moduleId)
			&& (this.moduleRightsId == castOther.moduleRightsId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.accountTypeId;
		hash = hash * prime + this.moduleId;
		hash = hash * prime + this.moduleRightsId;
		
		return hash;
	}
}