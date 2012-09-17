package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user_technical_skills database table.
 * 
 */
@Entity
@Table(name="user_technical_skills")
public class UserTechnicalSkill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="technical_skills_id")
	private int technicalSkillsId;

	private byte active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	private byte flag;

	@Column(name="proficiency_level_id")
	private int proficiencyLevelId;

	@Column(name="skill_description")
	private String skillDescription;

	@Column(name="skill_name")
	private String skillName;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public UserTechnicalSkill() {
	}

	public int getTechnicalSkillsId() {
		return this.technicalSkillsId;
	}

	public void setTechnicalSkillsId(int technicalSkillsId) {
		this.technicalSkillsId = technicalSkillsId;
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

	public int getProficiencyLevelId() {
		return this.proficiencyLevelId;
	}

	public void setProficiencyLevelId(int proficiencyLevelId) {
		this.proficiencyLevelId = proficiencyLevelId;
	}

	public String getSkillDescription() {
		return this.skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}