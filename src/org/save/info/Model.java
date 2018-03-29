package Org.save.Info;
public class Model {
  View v;
  Preson p;
  public Model(){
	  v = new View("App");
  }
  public void ShowDATA() throws FileNotFoundException{
	  v.Update("SAVED","NOT SAVED",new Person());
  }
}
