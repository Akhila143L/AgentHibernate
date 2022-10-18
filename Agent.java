package com.infinite.agenthib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Agent")
public class Agent {
	
	@Id
	@Column (name="Agentid")
	private int Agentid;
	
	@Column (name="Name")
	private String Name;
	
	@Column (name="City")
	private String City;
	
	@Enumerated(EnumType.STRING)
	@Column (name="Gender")
	private Gender Gender;
	
	@Column (name="MaritalStatus")
	private int MaritalStatus;
	
	@Column (name="premium")
	private double premium;

	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agent(int agentid, String name, String city, com.infinite.agenthib.Gender gender, int maritalStatus,
			double premium) {
		super();
		Agentid = agentid;
		Name = name;
		City = city;
		Gender = gender;
		MaritalStatus = maritalStatus;
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "Agent [Agentid=" + Agentid + ", Name=" + Name + ", City=" + City + ", Gender=" + Gender
				+ ", MaritalStatus=" + MaritalStatus + ", premium=" + premium + "]";
	}

	public int getAgentid() {
		return Agentid;
	}

	public void setAgentid(int agentid) {
		Agentid = agentid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Gender getGender() {
		return Gender;
	}

	public void setGender(Gender gender) {
		Gender = gender;
	}

	public int getMaritalStatus() {
		return MaritalStatus;
	}

	public void setMaritalStatus(int maritalStatus) {
		MaritalStatus = maritalStatus;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}
	
	
}
