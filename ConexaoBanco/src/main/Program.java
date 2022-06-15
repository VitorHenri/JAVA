package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program {
	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:postgresql://db-dev.devcoffee.cloud/vs_mbcorreias", "brerp",
				"*BrerP*");

		if (conn != null) {
			System.out.println("Conectado");
		}
	}
}
