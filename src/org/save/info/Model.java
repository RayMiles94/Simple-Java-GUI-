package Org.save.Info;

import java.io.FileNotFoundException;

public class Model {
  View v;
  Preson p;
  Controle c;
  public Model(){
	  v = new View("App");
  }
  
  public void ShowDATA() throws FileNotFoundException{
	  p = new Preson();
	  c = new Controle(v.tn.getText(),v.tp.getText());
	  v.Update("SAVED","NOT SAVED",p);
  }
}
