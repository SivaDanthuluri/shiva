package com.app.dao;

import java.util.List;

import com.app.data.Team;
import com.app.exception.BusinessException;

public interface TeamDAO {
	
	public Team createTeam(Team team) throws BusinessException;
	public List<Team> getAllTeams() throws BusinessException;
	public List<Team> getTeamByName(String teamName) throws BusinessException;
	

}
