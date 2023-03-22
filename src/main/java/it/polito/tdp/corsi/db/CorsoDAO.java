package it.polito.tdp.corsi.db;

import java.sql.*;
import java.util.*;

import it.polito.tdp.corsi.model.Corso;

public class CorsoDAO {

	public List<Corso> getCorsiByPeriodo(int periodo){
		String sql = "SELECT * "
				+ "FROM corso "
				+ "WHERE pd = " + periodo;
		
		List<Corso> resultCorso = new ArrayList<>();
		
		Connection conn = ConnectDB.getConnection();
		
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, periodo);
			
		} catch (SQLException e) {
			System.out.println("Error in corso DAO");
			e.printStackTrace();
		}
	}
}
