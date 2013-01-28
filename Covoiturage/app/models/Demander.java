package models;

public class Demander {
	
	private int numUser;
	private int numTrajet;
	
	
	public int getNumUser() {
		return numUser;
	}


	public void setNumUser(int numUser) {
		this.numUser = numUser;
	}

	public int getNumTrajet() {
		return numTrajet;
	}

	public void setNumTrajet(int numTrajet) {
		this.numTrajet = numTrajet;
	}

	public Demander(int numUser, int numTrajet) {
		super();
		this.numUser = numUser;
		this.numTrajet = numTrajet;
	}
	
	
	
}
