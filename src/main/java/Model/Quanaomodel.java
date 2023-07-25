package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Quanaomodel {
	private Connection con;
	
	public Quanaomodel() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/db_shopthoitrang", "root", "123456");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Quanao> getAllNhaSanXuat() throws SQLException {
		List<Quanao> quanaolList = new ArrayList<>();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM quanao");
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			Quanao nsx = new Quanao();
			nsx.setID_QA(rs.getInt("ID_QA"));
			nsx.setTen_QA(rs.getString("Ten_QA"));
			nsx.setSize(rs.getString("Size"));
			nsx.setGiaBan(rs.getDouble("GiaBan"));
			nsx.setSoLuong(rs.getInt("SoLuong"));
			nsx.setMoTa(rs.getString("MoTa"));
			quanaolList.add(nsx);
		}
		rs.close();
		pst.close();
		return quanaolList;
	}
}
