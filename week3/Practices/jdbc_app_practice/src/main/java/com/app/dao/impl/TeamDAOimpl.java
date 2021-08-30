package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.app.dao.TeamDAO;
import com.app.dao.dbutil.MySqlDbConnection;
import com.app.data.Team;
import com.app.exception.BusinessException;

public class TeamDAOimpl implements TeamDAO {
	


	@Override
	public Team createTeam(Team team) throws BusinessException {
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="insert into team(teamName) values (?)";
			PreparedStatement preparedStatement= connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, team.getTeamName());
			
			int c=preparedStatement.executeUpdate();
			if(c==1) {
				ResultSet resultSet=preparedStatement.getGeneratedKeys();
				if(resultSet.next()) {
					team.setId(resultSet.getInt(1));
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal Error occured contact support");
		}
		return team;
	}

	@Override
	public List<Team> getAllTeams() throws BusinessException {
		try(Connection connection=MySqlDbConnection.getConnection()){
			
		
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal Error occured contact support");
		}
		return null;
		
	}

	@Override
	public List<Team> getTeamByName(String teamName) throws BusinessException {
		try(Connection connection=MySqlDbConnection.getConnection()){
			
		
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal Error occured contact support");
		}
		
		return null;
	}

	
	
	

}
