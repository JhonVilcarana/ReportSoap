package pe.edu.upeu.soap.ws.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {

	private static final String URL = "jdbc:mysql://localhost:3306/reportexml?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "";
	private static final String DRIVER= "com.mysql.cj.jdbc.Driver";
	private static Connection cx = null;
	
	public static  Connection getConexion() {		
		try {
			Class.forName(DRIVER);
			if(cx==null) {
				cx = DriverManager.getConnection(URL, USER, PASS);
			}		
		} catch (Exception e) {
			System.out.println(e);
		}
		return cx;
	}	
}
