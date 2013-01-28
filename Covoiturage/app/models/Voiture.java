package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Voiture extends Model{
	private String immatriculation;
	private String modele;
	private String marque;
	private String annee;
	private String puissance;
	private String type_carburant;
	private String type_boite;
	private String couleur;
	
	public Voiture(String immatriculation, String modele, String marque,
			String annee, String puissance, String type_carburant,
			String type_boite, String couleur) {
		super();
		this.immatriculation = immatriculation;
		this.modele = modele;
		this.marque = marque;
		this.annee = annee;
		this.puissance = puissance;
		this.type_carburant = type_carburant;
		this.type_boite = type_boite;
		this.couleur = couleur;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public String getPuissance() {
		return puissance;
	}

	public void setPuissance(String puissance) {
		this.puissance = puissance;
	}

	public String getType_carburant() {
		return type_carburant;
	}

	public void setType_carburant(String type_carburant) {
		this.type_carburant = type_carburant;
	}

	public String getType_boite() {
		return type_boite;
	}

	public void setType_boite(String type_boite) {
		this.type_boite = type_boite;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
	

}
