package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the banners database table.
 * 
 */
@Entity
@Table(name="banners")
public class Banner implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="banner_id")
	private int bannerId;

	private byte active;

	@Column(name="banner_picture")
	private String bannerPicture;

	@Column(name="banner_type")
	private String bannerType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_expiry")
	private Date dateExpiry;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	private byte flag;

	private String title;

	@Column(name="url_link")
	private String urlLink;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="posted_by_user_id")
	private User user;

	public Banner() {
	}

	public int getBannerId() {
		return this.bannerId;
	}

	public void setBannerId(int bannerId) {
		this.bannerId = bannerId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getBannerPicture() {
		return this.bannerPicture;
	}

	public void setBannerPicture(String bannerPicture) {
		this.bannerPicture = bannerPicture;
	}

	public String getBannerType() {
		return this.bannerType;
	}

	public void setBannerType(String bannerType) {
		this.bannerType = bannerType;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateExpiry() {
		return this.dateExpiry;
	}

	public void setDateExpiry(Date dateExpiry) {
		this.dateExpiry = dateExpiry;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrlLink() {
		return this.urlLink;
	}

	public void setUrlLink(String urlLink) {
		this.urlLink = urlLink;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}