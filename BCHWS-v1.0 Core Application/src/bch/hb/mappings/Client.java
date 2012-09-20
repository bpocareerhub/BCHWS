package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the clients database table.
 * 
 */
@Entity
@Table(name="clients")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="client_id")
	private int clientId;

	@Column(name="account_owner_user_id")
	private int accountOwnerUserId;

	private int active;

	@Lob
	private String address;

	@Column(name="address_city_code")
	private String addressCityCode;

	@Column(name="careerpost_credits")
	private int careerpostCredits;

	@Column(name="client_type_id")
	private int clientTypeId;

	@Column(name="country_code")
	private String countryCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	@Lob
	private String description;

	@Column(name="download_credits")
	private int downloadCredits;

	private String facebook;

	@Column(name="fax_number")
	private String faxNumber;

	private int flag;

	@Column(name="industry_id")
	private int industryId;

	@Column(name="industry_sector_id")
	private int industrySectorId;

	private String linkedin;

	private String logo;

	private String name;

	@Column(name="office_phone_number")
	private String officePhoneNumber;

	private int priority;

	@Column(name="sec_number")
	private String secNumber;

	private String tin;

	private String twitter;

	@Column(name="url_website")
	private String urlWebsite;

	@Column(name="youtube_link")
	private String youtubeLink;

	//bi-directional many-to-many association to User
	@ManyToMany(mappedBy="clients")
	private List<User> users;

	public Client() {
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getAccountOwnerUserId() {
		return this.accountOwnerUserId;
	}

	public void setAccountOwnerUserId(int accountOwnerUserId) {
		this.accountOwnerUserId = accountOwnerUserId;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressCityCode() {
		return this.addressCityCode;
	}

	public void setAddressCityCode(String addressCityCode) {
		this.addressCityCode = addressCityCode;
	}

	public int getCareerpostCredits() {
		return this.careerpostCredits;
	}

	public void setCareerpostCredits(int careerpostCredits) {
		this.careerpostCredits = careerpostCredits;
	}

	public int getClientTypeId() {
		return this.clientTypeId;
	}

	public void setClientTypeId(int clientTypeId) {
		this.clientTypeId = clientTypeId;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDownloadCredits() {
		return this.downloadCredits;
	}

	public void setDownloadCredits(int downloadCredits) {
		this.downloadCredits = downloadCredits;
	}

	public String getFacebook() {
		return this.facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getFaxNumber() {
		return this.faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getIndustryId() {
		return this.industryId;
	}

	public void setIndustryId(int industryId) {
		this.industryId = industryId;
	}

	public int getIndustrySectorId() {
		return this.industrySectorId;
	}

	public void setIndustrySectorId(int industrySectorId) {
		this.industrySectorId = industrySectorId;
	}

	public String getLinkedin() {
		return this.linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfficePhoneNumber() {
		return this.officePhoneNumber;
	}

	public void setOfficePhoneNumber(String officePhoneNumber) {
		this.officePhoneNumber = officePhoneNumber;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getSecNumber() {
		return this.secNumber;
	}

	public void setSecNumber(String secNumber) {
		this.secNumber = secNumber;
	}

	public String getTin() {
		return this.tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public String getTwitter() {
		return this.twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getUrlWebsite() {
		return this.urlWebsite;
	}

	public void setUrlWebsite(String urlWebsite) {
		this.urlWebsite = urlWebsite;
	}

	public String getYoutubeLink() {
		return this.youtubeLink;
	}

	public void setYoutubeLink(String youtubeLink) {
		this.youtubeLink = youtubeLink;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}