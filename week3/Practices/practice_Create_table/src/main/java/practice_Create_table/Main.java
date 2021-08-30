package practice_Create_table;

import com.app.exception.BusinessException;

public class Main {

	public static void main(String[] args) {
		CartDAO cartDAO = new CartDAOimpl();
		
		
		try {
			cartDAO.createCart();
			
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}

}
