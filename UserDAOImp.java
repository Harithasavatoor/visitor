package com.capgemini.medicalmanagementinfo.userdaoimp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capgemini.medicalstoremanagmentinfo.userdao.UserDAO;

public class UserDAOImp implements UserDAO {

	public void insertCart(int cartId, int userId, int medicineId, String medicineName, int quantity,
			Double medicinePrice) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://localhost:3306/medicalstore_db";

			conn = DriverManager.getConnection(dburl, "root", "root");

			String query = "insert into  shoppingcart values(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, cartId);
			pstmt.setInt(2, userId);
			pstmt.setInt(3, medicineId);
			pstmt.setString(4, medicineName);
			pstmt.setInt(5, quantity);
			pstmt.setDouble(6, medicinePrice);
			pstmt.executeUpdate();
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
	}

	public void deleteCart(String medicineName) {
		Connection conn = null;
		PreparedStatement pstmt = null;
	 try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://localhost:3306/medicalstore_db";

			conn = DriverManager.getConnection(dburl, "root", "root");

			String query = "delete from shoppingcart where medicineName=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,medicineName);
			pstmt.executeUpdate();

	    }catch (Exception e) {

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
		
	}
	
}
//	public static void main(String[] args) {
////		public void userRegistration() {
//			Connection conn = null;
//			PreparedStatement pstmt = null;
//
//
//			try {
//				Class.forName("com.mysql.jdbc.Driver").newInstance();
//
//				String dburl = "jdbc:mysql://localhost:3306/medicalstore_db";
//
//				conn = DriverManager.getConnection(dburl, "root", "root");
//
//				String query = "insert into  userregistration values(?,?,?,?)";
//				pstmt = conn.prepareStatement(query);
//				pstmt.setString(1, args[0]);
//				pstmt.setString(2, args[1]);
//				pstmt.setString(3, args[2]);
//				pstmt.setInt(4, Integer.parseInt(args[3]));
//				int rs = pstmt.executeUpdate();
//				System.out.println(rs);
//
//			} catch (Exception e) {
//
//				e.printStackTrace();
//			} finally {
//				if (conn != null) {
//					try {
//						conn.close();
//					} catch (SQLException e) {
//						e.printStackTrace();
//					}
//					if (pstmt != null) {
//						try {
//							pstmt.close();
//						} catch (SQLException e) {
//							e.printStackTrace();
//						}
//					}
//				}
//			}
//
//		}// end of userRegistration method
//
//	}//end of registration class

		
	
