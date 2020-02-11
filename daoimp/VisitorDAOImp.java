package com.capgemini.medicalstoremanagment.daoimp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.capgemini.medicalstoremanagement.dto.VisitorInfo;
import com.capgemini.medicalstoremanagement.dto.VisitorMedicineInfo;

public class VisitorDAOImp implements VisitorDAO {
	public List detailsInfo() {
		List<VisitorInfo> list = new ArrayList<VisitorInfo>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicalstore_db", "root", "root");
			String query = "select * from medicalstoreuserinfo";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			VisitorInfo visitorinfo = new VisitorInfo();
			while (rs.next()) {
				visitorinfo = new VisitorInfo();
				visitorinfo.setUserId(rs.getInt("userId"));
				visitorinfo.setUserName(rs.getString("userName"));
				visitorinfo.setUserMobno(rs.getInt("userMobno"));
				visitorinfo.setUserAddress(rs.getString("userAddress"));
				visitorinfo.setPincode(rs.getInt("userPincode"));
				visitorinfo.setUserDob(rs.getDate("userDob"));
				visitorinfo.setUserDisease(rs.getString("userDisease"));
				visitorinfo.setMedicineId(rs.getInt("medicineId"));
				visitorinfo.setMedbookingDate(rs.getDate("usermedBookingDate"));
				visitorinfo.setUserPassword(rs.getString("userPassword"));
				visitorinfo.setUserBookingId(rs.getInt("userBookingId"));
				list.add(visitorinfo);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	public List medicineInfo() {
		List<VisitorMedicineInfo> list1 = new ArrayList<VisitorMedicineInfo>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicalstore_db", "root", "root");
			String query = "select * from medicalstoremedicineinfo";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				VisitorMedicineInfo visitormedinfo = new VisitorMedicineInfo();
				visitormedinfo.setMedicineId(rs.getInt("medicineId"));
				visitormedinfo.setMedicineName(rs.getString("medicineName"));
				visitormedinfo.setMedicinePrice(rs.getInt("medicinePrice"));
				visitormedinfo.setMedicineMfgDate(rs.getDate("medicineMfgDate"));
				visitormedinfo.setMedicineExpDate(rs.getDate("medicineExpDate"));
				visitormedinfo.setMedicineCompany(rs.getString("medicineCompany"));
				list1.add(visitormedinfo);
			}
			return list1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

}
