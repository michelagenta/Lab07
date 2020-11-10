package it.polito.tdp.poweroutages.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.poweroutages.model.NERCIdMap;
import it.polito.tdp.poweroutages.model.Nerc;
import it.polito.tdp.poweroutages.model.PowerOutages;

public class PowerOutageDAO {
	
	public List<Nerc> getNercList(NERCIdMap map) {

		String sql = "SELECT id, value FROM nerc";
		List<Nerc> nercList = new ArrayList<>();

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet res = st.executeQuery();

			while (res.next()) {
				Nerc n = new Nerc(res.getInt("id"), res.getString("value"));
				nercList.add(n);
			}

			conn.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return nercList;
	}
	
public List<PowerOutages> getPowerOutages(NERCIdMap map){
	String sql = "SELECT id, nerc_id,date_event_began,date_event_finished,customers_affected FROM poweroutages ";
	List<PowerOutages> powerList = new ArrayList<>();

	try {
		Connection conn = ConnectDB.getConnection();
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet res = st.executeQuery();

		while (res.next()) {
			Nerc n = map.get(res.getInt("nerc_id"));
			if(n==null) {
	System.out.println("Errore");
		} else {
			
			PowerOutages pow= new PowerOutages(res.getInt("id"),n,res.getTimestamp("date_event_began").toLocalDateTime(),res.getTimestamp("date_event_finished").toLocalDateTime(),res.getInt("customer_affected"));
		powerList.add(pow);
		}

		conn.close();
		}
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}

	return powerList;
	}

}
	
	

