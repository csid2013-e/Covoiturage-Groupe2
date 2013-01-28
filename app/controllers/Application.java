package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void Demandetrajet(){
    	render("Application/Demandetrajet.html");
    }
    
    public static void ProposerTrajet(){
    	render("Application/Proposer_trajet.html");
    }
    
    
}