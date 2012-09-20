package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the requisitions database table.
 * 
 */
@Entity
@Table(name="requisitions")
public class Requisition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="requisition_id")
	private int requisitionId;

	private byte active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	private byte flag;

	private String message;

	@Column(name="posted_by_user_id")
	private int postedByUserId;

	@Column(name="reply_to_requisition_id")
	private int replyToRequisitionId;

	@Column(name="requisition_type")
	private int requisitionType;

	private String title;

	public Requisition() {
	}

	public int getRequisitionId() {
		return this.requisitionId;
	}

	public void setRequisitionId(int requisitionId) {
		this.requisitionId = requisitionId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getPostedByUserId() {
		return this.postedByUserId;
	}

	public void setPostedByUserId(int postedByUserId) {
		this.postedByUserId = postedByUserId;
	}

	public int getReplyToRequisitionId() {
		return this.replyToRequisitionId;
	}

	public void setReplyToRequisitionId(int replyToRequisitionId) {
		this.replyToRequisitionId = replyToRequisitionId;
	}

	public int getRequisitionType() {
		return this.requisitionType;
	}

	public void setRequisitionType(int requisitionType) {
		this.requisitionType = requisitionType;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}