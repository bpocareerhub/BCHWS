package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the account_types database table.
 * 
 */
@Entity
@Table(name="account_types")
public class AccountType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="account_type_id")
	private int accountTypeId;

	@Lob
	@Column(name="account_type_description")
	private String accountTypeDescription;

	@Column(name="account_type_name")
	private String accountTypeName;

	@Column(name="group_id_restrictions")
	private int groupIdRestrictions;

	//bi-directional many-to-one association to AccountTypeRight
	@OneToMany(mappedBy="accountType")
	private List<AccountTypeRight> accountTypeRights;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="accountType")
	private List<User> users;

	public AccountType() {
	}

	public int getAccountTypeId() {
		return this.accountTypeId;
	}

	public void setAccountTypeId(int accountTypeId) {
		this.accountTypeId = accountTypeId;
	}

	public String getAccountTypeDescription() {
		return this.accountTypeDescription;
	}

	public void setAccountTypeDescription(String accountTypeDescription) {
		this.accountTypeDescription = accountTypeDescription;
	}

	public String getAccountTypeName() {
		return this.accountTypeName;
	}

	public void setAccountTypeName(String accountTypeName) {
		this.accountTypeName = accountTypeName;
	}

	public int getGroupIdRestrictions() {
		return this.groupIdRestrictions;
	}

	public void setGroupIdRestrictions(int groupIdRestrictions) {
		this.groupIdRestrictions = groupIdRestrictions;
	}

	public List<AccountTypeRight> getAccountTypeRights() {
		return this.accountTypeRights;
	}

	public void setAccountTypeRights(List<AccountTypeRight> accountTypeRights) {
		this.accountTypeRights = accountTypeRights;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}