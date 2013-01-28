package models;

import java.util.Date;

import javax.persistence.Entity;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Trajet extends Model{

	@Required
	public String VilleDepart;

	@Required
	public String VilleArrive;
	
	@Required
	public Date date;
	
	@Required
	public int idUser;
	
	public Trajet(String villeDepart, String villeArrive, Date date, int idUser) {
		VilleDepart = villeDepart;
		VilleArrive = villeArrive;
		this.date = date;
		this.idUser = idUser;
	}

	@Override
	public String toString() {
		return "Trajet : Ville de départ :" + VilleDepart + ", Ville d'arrivée :"
				+ VilleArrive + ", Le " + date + ", Utilisateur :" + idUser + "";
	}
	

}
