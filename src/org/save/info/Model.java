package Org.save.Info;

import java.io.FileNotFoundException;

public class Model {
  View v;
  Preson p;
  public Model(){
	  v = new View("App");
  }
  public void ShowDATA() throws FileNotFoundException{
	  p = new Preson();
	  v.Update("SAVED","NOT SAVED",p);
  }
}
