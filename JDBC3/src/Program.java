import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program {

	public static void main(String[] args) throws SQLException, IOException {
	
		Connection conn = DriverManager.getConnection("jdbc:postgresql://db-dev.devcoffee.cloud/vs_mbcorreias","brerp","*BrerP*");
		
		if(conn!=null) {
			System.out.println("Conectado");
		}
		
		conn.setAutoCommit(false);		
		PreparedStatement st = conn.prepareStatement("select * from c_bpartner");
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("c_bpartner_id")+rs.getString("name"));
		}
		
	}

}
