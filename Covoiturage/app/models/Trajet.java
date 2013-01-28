package models;

import java.util.Date;

public class Trajet {

	public String VilleDepart;
	public String VilleArrive;
	public Date date;
	public int idUser;
	
	public Trajet(String villeDepart, String villeArrive, Date date, int idUser) {
		VilleDepart = villeDepart;
		VilleArrive = villeArrive;
		this.date = date;
		this.idUser = idUser;
	}

	
	

}
