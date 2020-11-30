package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Oracle001 {
	public static void main(String[] args) {

		try {
//			1. oracle 연동하기 - 드라이버 연동
//			회사명.프로젝트명.단위
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			2. database 연동 DriverManager.getConnection("","","");
			Connection conn = DriverManager.getConnection(
//					"jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle")
					"jdbc:oracle:thin:@localhost:1521:xe", "o2", "1111");
			if(conn!=null) {System.out.println("DATABASE에 연결되었습니다.");}
		} catch (ClassNotFoundException e) { e.printStackTrace(); 
		} catch (SQLException e) { e.printStackTrace(); 
		}
	}
}
/**
Q1) 이클립스에서 오라클 o2/1111 사용자 jdbc 연동
*/