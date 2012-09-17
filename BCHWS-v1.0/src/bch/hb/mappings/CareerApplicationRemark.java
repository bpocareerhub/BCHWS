package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the career_application_remarks database table.
 * 
 */
@Entity
@Table(name="career_application_remarks")
public class CareerApplicationRemark implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="remark_id")
	private int remarkId;

	private byte active;

	@Column(name="application_id")
	private int applicationId;

	@Column(name="career_id")
	private int careerId;

	@Column(name="created_by_user_id")
	private int createdByUserId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	private byte flag;

	@Lob
	private String remark;

	@Column(name="reply_to_remark_id")
	private int replyToRemarkId;

	public CareerApplicationRemark() {
	}

	public int getRemarkId() {
		return this.remarkId;
	}

	public void setRemarkId(int remarkId) {
		this.remarkId = remarkId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public int getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getCareerId() {
		return this.careerId;
	}

	public void setCareerId(int careerId) {
		this.careerId = careerId;
	}

	public int getCreatedByUserId() {
		return this.createdByUserId;
	}

	public void setCreatedByUserId(int createdByUserId) {
		this.createdByUserId = createdByUserId;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getReplyToRemarkId() {
		return this.replyToRemarkId;
	}

	public void setReplyToRemarkId(int replyToRemarkId) {
		this.replyToRemarkId = replyToRemarkId;
	}

}