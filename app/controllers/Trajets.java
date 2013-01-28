package controllers;

import java.util.Date;
import java.util.List;

import models.Trajet;
import play.mvc.Controller;

public class Trajets extends Controller{

	public static void index(){ 
		// Trajet trajet = new Trajet("Paris", "Lyon", new Date(),1).save();
		//Trajet trajet2 = new Trajet("Marseille", "Lyon", new Date(),1).save();
			List<Trajet> trajets = Trajet.find(
		            "order by date desc"
		        ).fetch();
		        render(trajets);
	}
}
