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
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="client_id")
	private int clientId;

	@Column(name="account_owner_user_id")
	private int accountOwnerUserId;
	
	@Column(name="active")
	private boolean active;

	@Column(name="address")
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

	@Column(name="description")
	private String description;

	@Column(name="download_credits")
	private int downloadCredits;

	@Column(name="facebook")
	private String facebook;

	@Column(name="fax_number")
	private String faxNumber;

	@Column(name="flag")
	private boolean flag;

	@Column(name="industry_id")
	private int industryId;

	@Column(name="industry_sector_id")
	private int industrySectorId;

	@Column(name="linkedin")
	private String linkedin;

	@Column(name="logo")
	private String logo;

	@Column(name="name")
	private String name;

	@Column(name="office_phone_number")
	private String officePhoneNumber;

	@Column(name="priority")
	private boolean priority;

	@Column(name="sec_number")
	private String secNumber;

	@Column(name="tin")
	private String tin;

	@Column(name="twitter")
	private String twitter;

	@Column(name="url_website")
	private String urlWebsite;

	@Column(name="youtube_link")
	private String youtubeLink;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="client")
	private List<User> users;

	public Client() {
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getAccountOwnerUserId() {
		return accountOwnerUserId;
	}

	public void setAccountOwnerUserId(int accountOwnerUserId) {
		this.accountOwnerUserId = accountOwnerUserId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressCityCode() {
		return addressCityCode;
	}

	public void setAddressCityCode(String addressCityCode) {
		this.addressCityCode = addressCityCode;
	}

	public int getCareerpostCredits() {
		return careerpostCredits;
	}

	public void setCareerpostCredits(int careerpostCredits) {
		this.careerpostCredits = careerpostCredits;
	}

	public int getClientTypeId() {
		return clientTypeId;
	}

	public void setClientTypeId(int clientTypeId) {
		this.clientTypeId = clientTypeId;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDownloadCredits() {
		return downloadCredits;
	}

	public void setDownloadCredits(int downloadCredits) {
		this.downloadCredits = downloadCredits;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getIndustryId() {
		return industryId;
	}

	public void setIndustryId(int industryId) {
		this.industryId = industryId;
	}

	public int getIndustrySectorId() {
		return industrySectorId;
	}

	public void setIndustrySectorId(int industrySectorId) {
		this.industrySectorId = industrySectorId;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfficePhoneNumber() {
		return officePhoneNumber;
	}

	public void setOfficePhoneNumber(String officePhoneNumber) {
		this.officePhoneNumber = officePhoneNumber;
	}

	public boolean isPriority() {
		return priority;
	}

	public void setPriority(boolean priority) {
		this.priority = priority;
	}

	public String getSecNumber() {
		return secNumber;
	}

	public void setSecNumber(String secNumber) {
		this.secNumber = secNumber;
	}

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getUrlWebsite() {
		return urlWebsite;
	}

	public void setUrlWebsite(String urlWebsite) {
		this.urlWebsite = urlWebsite;
	}

	public String getYoutubeLink() {
		return youtubeLink;
	}

	public void setYoutubeLink(String youtubeLink) {
		this.youtubeLink = youtubeLink;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}