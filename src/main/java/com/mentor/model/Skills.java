package com.mentor.model;

public class Skills {
	int skillsId;
	String name;
	String toc;
	String prerequisites;
	public int getSkillsId() {
		return skillsId;
	}
	public void setSkillsId(int skillsId) {
		this.skillsId = skillsId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getToc() {
		return toc;
	}
	public void setToc(String toc) {
		this.toc = toc;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
	
}
