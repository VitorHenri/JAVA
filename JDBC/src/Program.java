import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws SQLException, IOException {
		String url = "jdbc:postgresql://rdp18.devcoffee.com.br:5432/vs_mbcorreias";
		String user = "brerp";
		String password = "*BrerP*";
		
		Connection conn = DriverManager.getConnection(url,user,password);
		
		if(conn!=null) {
			System.out.println("Conectado");
		}
		FileWriter fw = new FileWriter("C:\\Users\\Usuario\\Documents\\teste.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from c_bpartner");
		while(rs.next()) {
			bw.write(rs.getInt("c_bpartner_id")+" "+rs.getString("name").toUpperCase()+" "+rs.getString("lbr_cnpj"));
			bw.newLine();
		}
		FileReader fr = new FileReader("C:\\Users\\Usuario\\Documents\\teste.txt");
		BufferedReader br = new BufferedReader(fr);
		while(br.ready()) {
			System.out.println(br.readLine()+"\n");
		}
		conn.close();
		bw.close();

	}

}
