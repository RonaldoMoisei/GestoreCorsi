package it.polito.tdp.corsi.model;

import java.util.*;

import it.polito.tdp.corsi.db.CorsoDAO;

public class testDAO {

	public static void main(String[] args) {
		CorsoDAO dao = new CorsoDAO();
		List<Corso> result = new ArrayList<>();
		result = dao.getCorsiByPeriodo(1);
		

		for(Corso c: result) {
			System.out.println(c.toString());
		}
	}

}
