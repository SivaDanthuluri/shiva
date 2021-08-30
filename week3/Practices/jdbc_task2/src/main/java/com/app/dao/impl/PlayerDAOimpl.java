package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerDAO;
import com.app.dao.dbutil.MySqlDbConnection;
import com.app.data.Player;
import com.app.exception.BusinessException;

public class PlayerDAOimpl implements PlayerDAO{
	
	@Override

	public List<Player> getAllPlayers() throws BusinessException {
		
		List<Player> playerList=new ArrayList<>();
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="select id,name,age,gender,city,sportsName,contact from player order by id";
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			
			ResultSet resultSet= preparedStatement.executeQuery();	
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				playerList.add(player);
		
			}
		} catch (ClassNotFoundException  | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured please contact support");
		} 
		
		return playerList;
	}

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c=0;
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="insert into player (id,name,age,gender,city,sportsName,contact) values(?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2,player.getName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setString(4, player.getGender());
			preparedStatement.setString(5,player.getCity());
			preparedStatement.setString(6,player.getSportsName());
			preparedStatement.setLong(7,player.getContact());
			c=preparedStatement.executeUpdate();
		} catch (ClassNotFoundException  | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured please contact support");
		} 
		
		return c;
	}

	@Override
	public int updatePlayer(Player player) throws BusinessException {
		int d=0;
		try(Connection connection=MySqlDbConnection.getConnection()){
			
			String sql="update  player set id=?,name=?,gender=?,city=?,sportsName=?,age=?,contact=?  where id=109";
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2,player.getName());
			preparedStatement.setString(3, player.getGender());
			preparedStatement.setString(4,player.getCity());
			preparedStatement.setString(5,player.getSportsName());
			preparedStatement.setInt(6, player.getAge());
			preparedStatement.setLong(7,player.getContact());
			d=preparedStatement.executeUpdate();
		
		}  catch (ClassNotFoundException  | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error occured please contact support");
			
		} 
		
		
		return d;
	}

	@Override
	public int deletePlayer(Player player) throws BusinessException {
		int e=0;
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql= "delete from player where id=108";
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			e=preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException  | SQLException e1) {
			System.out.println(e1);
			throw new BusinessException("Internal Error occured please contact support");
			
		} 
		return 0;
	}
	

}
