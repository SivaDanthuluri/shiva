package com.app.data;

public class Team {
	private int id;
	private String teamName;
	
public Team() {
	// TODO Auto-generated constructor stub
}

public Team(String teamName) {
	super();
	this.teamName = teamName;
}

public String getTeamName() {
	return teamName;
}

public void setTeamName(String teamName) {
	this.teamName = teamName;
}


public void setId(int id) {
	this.id = id;
}

public int getId() {
	return id;
}

@Override
public String toString() {
	return "Team [id=" + id + ", teamName=" + teamName + "]";
}


}
