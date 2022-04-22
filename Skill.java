package com.zensar.bean;

public class Skill {
	String skillName;
	int skilllevel;

	public Skill(String skillName, int skilllevel) {
		super();
		this.skillName = skillName;
		this.skilllevel = skilllevel;
	}

	public Skill() {
		super();
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getSkilllevel() {
		return skilllevel;
	}

	public void setSkilllevel(int skilllevel) {
		this.skilllevel = skilllevel;
	}

	@Override
	public String toString() {
		return "Skill [skillName=" + skillName + ", skilllevel=" + skilllevel + "]";
	}

}