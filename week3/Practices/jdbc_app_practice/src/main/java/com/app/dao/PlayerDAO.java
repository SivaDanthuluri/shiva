package com.app.dao;

import java.util.List;

import com.app.data.Player;
import com.app.exception.BusinessException;

public interface PlayerDAO {
	
	public List<Player> getAllPlayers() throws BusinessException;
	public int createPlayer(Player player) throws BusinessException;
	public int updatePlayer(Player player) throws BusinessException;
	public int deletePlayer(Player player) throws BusinessException;
	
}
