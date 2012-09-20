package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the scheduled_tasks database table.
 * 
 */
@Entity
@Table(name="scheduled_tasks")
public class ScheduledTask implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="task_id")
	private int taskId;

	private byte active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="execute_date")
	private Date executeDate;

	private byte flag;

	@Column(name="task_type_id")
	private int taskTypeId;

	@Column(name="task_with_id")
	private int taskWithId;

	public ScheduledTask() {
	}

	public int getTaskId() {
		return this.taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getExecuteDate() {
		return this.executeDate;
	}

	public void setExecuteDate(Date executeDate) {
		this.executeDate = executeDate;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public int getTaskTypeId() {
		return this.taskTypeId;
	}

	public void setTaskTypeId(int taskTypeId) {
		this.taskTypeId = taskTypeId;
	}

	public int getTaskWithId() {
		return this.taskWithId;
	}

	public void setTaskWithId(int taskWithId) {
		this.taskWithId = taskWithId;
	}

}