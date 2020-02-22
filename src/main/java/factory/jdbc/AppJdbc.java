package factory.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class AppJdbc {
	
	public static void main(String[] args) {
		
		try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:~teste", "sa","")){
			System.out.println(conn.getClass().getName());
			System.out.println("Foi");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
