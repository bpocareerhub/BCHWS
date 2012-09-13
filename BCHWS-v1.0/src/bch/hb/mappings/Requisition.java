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
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="requisition_id")
	private int requisitionId;

	@Column(name="active")
	private boolean active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Column(name="flag")
	private boolean flag;

	@Column(name="message")
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
		return requisitionId;
	}

	public void setRequisitionId(int requisitionId) {
		this.requisitionId = requisitionId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getPostedByUserId() {
		return postedByUserId;
	}

	public void setPostedByUserId(int postedByUserId) {
		this.postedByUserId = postedByUserId;
	}

	public int getReplyToRequisitionId() {
		return replyToRequisitionId;
	}

	public void setReplyToRequisitionId(int replyToRequisitionId) {
		this.replyToRequisitionId = replyToRequisitionId;
	}

	public int getRequisitionType() {
		return requisitionType;
	}

	public void setRequisitionType(int requisitionType) {
		this.requisitionType = requisitionType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}