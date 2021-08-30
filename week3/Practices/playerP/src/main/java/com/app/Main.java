package com.app;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.search.service.PlayerSearchService;
import com.app.search.service.impl.PlayerSearchServiceImpl;

public class Main {

	private static Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		log.info("Welcome to Shiva's Player App");
		log.info("==========================================");

		int ch = 0;
		do {
			log.info("\nWhat you wish to do today?");
			log.info("1)Create A Player");
			log.info("2)Update A Player");
			log.info("3)Delete A Player");
			log.info("4)List All Players");
			log.info("5)Search Player with various filters");
			log.info("6)EXIT");
			log.info("Please enter your choice(1-6)");

			try {
				ch = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
			}

			switch (ch) {
			
			case 1:
				log.info("Create Player");

				break;
			case 2:
				log.info("Update player");

				break;
			case 3:
				log.info("Delete player");

				break;
			case 4:
				log.info("List Players");

				break;
			case 5:
				int option = 0;
				PlayerSearchService playerSearchService=new PlayerSearchServiceImpl();
				do {
					log.info(
							"\n\nWelcome to Player Search Menu... Search Your Players By various Filters from below Menu option");
					log.info("1. By Player ID");
					log.info("2. By Player Name");
					log.info("3. By Player Age");
					log.info("4. By Player Gender");
					log.info("5. By Player City");
					log.info("6. By TeamName");
					log.info("7. By SportsName");
					log.info("8. By Player Contact");
					log.info("9. Go back to Main Menu");
					log.info("Please enter your choice(1-9)");

					try {
						option = Integer.parseInt(scanner.nextLine());
					} catch (NumberFormatException e) {
					}
					switch (option) {
					case 1:log.info("Enter player id to get player details");
						try {
						int id=Integer.parseInt(scanner.nextLine());
						Player player=playerSearchService.getPlayerById(id);
						if(player!=null) {
							log.info("Player with id "+id+" found successfully... Below is the details");
							log.info(player);
						}
						}catch(NumberFormatException e) {
							log.warn("Player Id should be digit only... Try Again");
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 2:

						break;
					case 3:

						break;
					case 4:

						break;
					case 5:

						break;
					case 6:

						break;
					case 7:

						break;
					case 8:

						break;
					case 9:log.info("Welcome to Main Menu");

						break;

					default:
						log.warn("Invalid Search Option... Choice should be only number between 1-9 only. Kindly Retry ");
						break;
					}
				} while (option != 9);

				break;
			case 6:
				log.info("Thanks for using this APP we will see you soon :) ");

				break;

			default:
				log.warn("Invalid choice... Choice should be only number between 1-6 only ");
				break;
			}

		} while (ch != 6);

	}

}
