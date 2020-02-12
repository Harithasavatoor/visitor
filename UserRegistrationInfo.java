package com.capgemini.medicalmanagementinfo.userdaoimp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRegistrationInfo {
	public static void main(String[] args) {
//	public void userRegistration() {
		Connection conn = null;
		PreparedStatement pstmt = null;


		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://localhost:3306/medicalstore_db";

			conn = DriverManager.getConnection(dburl, "root", "root");

			String query = "insert into  userregistration values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, args[0]);
			pstmt.setString(2, args[1]);
			pstmt.setString(3, args[2]);
			pstmt.setInt(4, Integer.parseInt(args[3]));
			int rs = pstmt.executeUpdate();
			System.out.println(rs);

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}// end of userRegistration method

}//end of registration class
