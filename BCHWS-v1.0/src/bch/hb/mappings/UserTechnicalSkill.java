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
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="technical_skills_id")
	private int technicalSkillsId;

	@Column(name="active")
	private boolean active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	@Column(name="flag")
	private boolean flag;

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
		return technicalSkillsId;
	}

	public void setTechnicalSkillsId(int technicalSkillsId) {
		this.technicalSkillsId = technicalSkillsId;
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

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getProficiencyLevelId() {
		return proficiencyLevelId;
	}

	public void setProficiencyLevelId(int proficiencyLevelId) {
		this.proficiencyLevelId = proficiencyLevelId;
	}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}