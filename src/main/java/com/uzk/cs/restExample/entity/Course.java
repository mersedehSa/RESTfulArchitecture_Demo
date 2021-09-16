package com.uzk.cs.restExample.entity;

import javax.persistence.*;


@Entity
public class Course {
    @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer skillId;
    @Column
    private String skillName;
    @ManyToOne
    private User user;

    public Course(String skillName) {
		this.skillName = skillName;
	}

	public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
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

    public Course() {
    }

    public Course(String skillName, User user) {
        this.skillName = skillName;
        this.user = user;
    }
}
