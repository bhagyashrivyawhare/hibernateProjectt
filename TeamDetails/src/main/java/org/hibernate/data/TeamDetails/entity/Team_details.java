package org.hibernate.data.TeamDetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Team_details {
	@Id
	private int team_id;
	private String team_name;
	private String captain_name;
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public String getCaptain_name() {
		return captain_name;
	}
	public void setCaptain_name(String captain_name) {
		this.captain_name = captain_name;
	}
	@Override
	public String toString() {
		return "Team_details [team_id=" + team_id + ", team_name=" + team_name + ", captain_name=" + captain_name + "]";
	}
	
	

}
