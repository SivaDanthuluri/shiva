package com.app;

import java.util.List;

import com.app.dao.PlayerDAO;
import com.app.dao.TeamDAO;
import com.app.dao.impl.PlayerDAOimpl;
import com.app.dao.impl.TeamDAOimpl;
import com.app.data.Player;
import com.app.data.Team;
import com.app.exception.BusinessException;

public class Main {

	public static void main(String[] args) {

		PlayerDAO playerDAO= new PlayerDAOimpl();

	try {
		List<Player> playerList=playerDAO.getAllPlayers();
		for(Player player:playerList) {
			System.out.println(player);
		}
		
	}catch(BusinessException e) {
		System.out.println(e.getMessage());
	}
	
//	System.out.println();
//	
//	Player player=new Player (109,"Ms Dhoni","Ranchi","M","Cricket",35,4561237897L);
//	try {
//		if(playerDAO.createPlayer(player)==1) {
//			System.out.println("Player created with Below details Successfully");
//			System.out.println(player);
//		}
//	} catch (BusinessException e) {
//		System.out.println(e);
//	}
//	Player player=new Player(108,"Ms Dhoni","M","Ranchi","Cricket",35,4561237897L);
//	try {
//		if(playerDAO.updatePlayer(player)==1) {
//			System.out.println("Player updated with Below details Successfully");
//			System.out.println(player);
//		}
//	} catch (BusinessException e) {
//		System.out.println(e);
//}
//	Player player=new Player();
//	
//	try {
//		playerDAO.deletePlayer(player);
//		if(playerDAO.deletePlayer(player)==1) {
//			System.out.println("Player delete with Below details Successfully");
//			
//		}
//	} catch (BusinessException e) {
//		System.out.println(e);
//}

	
	TeamDAO teamDAO= new TeamDAOimpl();
	Team t1=new Team("India");
	
	try {
		t1=teamDAO.createTeam(t1);
		if(t1.getId()==1) {
			System.out.println(t1);
		}
	} catch (BusinessException e) {
		System.out.println(e.getMessage());
	}
	
}
}
