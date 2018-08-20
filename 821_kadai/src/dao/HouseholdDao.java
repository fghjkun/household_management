package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class HouseholdDao{

public static void newDataDAO(String key2, String key3, String key4, String key5, String key6) {
	// TODO 自動生成されたメソッド・スタブ
	Connection con = null;
	PreparedStatement pstmt = null;

	try {

		Class.forName("com.mysql.jdbc.Driver");


		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/821_kadaidb?useSSL=false",
				"root",
				"Osarusann66");

		String sql = "INSERT INTO 821_kadai2(date,income,spending,balanceg,type) VALUES(?,?,?,?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, key2);
		pstmt.setString(2, key3);
		pstmt.setString(3, key4);
		pstmt.setString(4, key5);
		pstmt.setString(5, key6);
		pstmt.executeUpdate();


} catch (ClassNotFoundException e) {
	System.out.println("JDBCドライバが見つかりません。");
	e.printStackTrace();
} catch (SQLException e) {
	System.out.println("DBアクセス時にエラーが発生しました。");
	e.printStackTrace();
} finally {


	try {
		if (pstmt != null) {
			pstmt.close();
		}
	} catch (SQLException e) {
		System.out.println("DBアクセス時にエラーが発生しました。");
		e.printStackTrace();
	}
	try {
		if (con != null) {
			con.close();
		}
	} catch (SQLException e) {
		System.out.println("DBアクセス時にエラーが発生しました。");
		e.printStackTrace();
	}
}
}
}