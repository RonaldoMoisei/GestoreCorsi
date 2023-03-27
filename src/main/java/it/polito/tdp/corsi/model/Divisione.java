package it.polito.tdp.corsi.model;

public class Divisione {

	String CDS;
	Integer nStudenti;
	public Divisione(String cDS, Integer nStudenti) {
		super();
		CDS = cDS;
		this.nStudenti = nStudenti;
	}
	public String getCDS() {
		return CDS;
	}
	public Integer getnStudenti() {
		return nStudenti;
	}
	
	
}
