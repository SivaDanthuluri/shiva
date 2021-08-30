package practice_Create_table;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.dao.dbutil.MySqlDbConnection;
import com.app.exception.BusinessException;

public class CartDAOimpl implements  CartDAO {

	@Override
	public void createCart() throws BusinessException {
		
		
		try(Connection connection=MySqlDbConnection.getConnection()){
			System.out.println("hello");
			String sql="create table cart (id int primary key auto_increment,order varchar(45), status varchar(45))";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
			
			 
		}catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal Error occured contact support");
		}
		
		
	}


}
