package com.koreait.second.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAO {
	//이것이 싱글톤이다! 
	//싱글톤 패턴 적용하는 것이 시험문제.
	private static OracleDAO dao = null;
	
	private OracleDAO() {}
	
	public static OracleDAO getInstance() {
		if(dao == null) {
			dao = new OracleDAO();
		}
		return dao;
	}

	/*public static void main(String[] args) throws Exception {
		OracleDAO dao = new OracleDAO();//static 메소드는 따로 static 메모리에 올라간다.(아예 메소드랑 다른 애라고 보는 것이 좋음)
		dao.getConn();	//OrcleDAO를 객체 선언 해줘야 getConn();을 사용할 수 있다.
		//try {
			//dao.getConn();
		//} catch (Exception e) {
			//e.printStackTrace();
		//}
	}*/

	public Connection getConn() throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
		Connection con = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, userName, password);

		System.out.println("접속성공!!!");

		/*
		 * try { Class.forName("oracle.jdbc.driver.OracleDriver"); con =
		 * DriverManager.getConnection(url, userName, password);
		 * 
		 * } catch(Exception e) {
		 * 
		 * e.printStackTrace(); //오류 떴을 시 나올 메세지
		 *
		 * } System.out.println("접속성공!!");
		 */

		return con;
	}
	
	public void closeConn(Connection conn) throws Exception{
		if(conn != null) {
			try {conn.close();
			} catch (Exception e) {}
		}
	}
}
