package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class User extends Model{
	
	private int id_user;
	private String last_name_user;
	private String first_name_user;
	private String ville;
	private String nom_rue;
	private int num_rue; 
	private int code_postal; 
	private int tel_fix; 
	private int portable; 
	private String courriel;
	private boolean statut_user;
	
	public User(int id_user, String last_name_user, String first_name_user,
			String ville, String nom_rue, int num_rue, int code_postal,
			int tel_fix, int portable, String courriel, boolean statut_user) {
		super();
		this.id_user = id_user;
		this.last_name_user = last_name_user;
		this.first_name_user = first_name_user;
		this.ville = ville;
		this.nom_rue = nom_rue;
		this.num_rue = num_rue;
		this.code_postal = code_postal;
		this.tel_fix = tel_fix;
		this.portable = portable;
		this.courriel = courriel;
		this.statut_user = statut_user;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getLast_name_user() {
		return last_name_user;
	}

	public void setLast_name_user(String last_name_user) {
		this.last_name_user = last_name_user;
	}

	public String getFirst_name_user() {
		return first_name_user;
	}

	public void setFirst_name_user(String first_name_user) {
		this.first_name_user = first_name_user;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNom_rue() {
		return nom_rue;
	}

	public void setNom_rue(String nom_rue) {
		this.nom_rue = nom_rue;
	}

	public int getNum_rue() {
		return num_rue;
	}

	public void setNum_rue(int num_rue) {
		this.num_rue = num_rue;
	}

	public int getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}

	public int getTel_fix() {
		return tel_fix;
	}

	public void setTel_fix(int tel_fix) {
		this.tel_fix = tel_fix;
	}

	public int getPortable() {
		return portable;
	}

	public void setPortable(int portable) {
		this.portable = portable;
	}

	public String getCourriel() {
		return courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	public boolean isStatut_user() {
		return statut_user;
	}

	public void setStatut_user(boolean statut_user) {
		this.statut_user = statut_user;
	}
	
	

}
