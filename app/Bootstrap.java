import play.*;
import play.jobs.*;
import play.test.*;
 
import models.*;
 
@OnApplicationStart
public class Bootstrap extends Job {
 
    public void doJob() {
    	//Fixtures.delete();
    	Fixtures.deleteDatabase();
        // Check if the database is empty
        if(Trajet.count() == 0) {
            Fixtures.loadModels("data.yml");
        }
    }
 
}