package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the account_type_rights database table.
 * 
 */
@Entity
@Table(name="account_type_rights")
public class AccountTypeRight implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="account_type_right_id")
	private int accountTypeRightId;

	@Column(name="module_id")
	private int moduleId;

	@Column(name="module_rights_id")
	private int moduleRightsId;

	//bi-directional many-to-one association to AccountType
	@ManyToOne
	@JoinColumn(name="account_type_id")
	private AccountType accountType;

	public AccountTypeRight() {
	}

	public int getAccountTypeRightId() {
		return this.accountTypeRightId;
	}

	public void setAccountTypeRightId(int accountTypeRightId) {
		this.accountTypeRightId = accountTypeRightId;
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

	public AccountType getAccountType() {
		return this.accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

}