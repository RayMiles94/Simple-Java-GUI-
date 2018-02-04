package Org.save.Info;

public class Controle {
    String name;
    String prenom;
    public Controle(String n,String p){
    	name   = n;
    	prenom = p;
    }
public Boolean setc() {
	    Boolean ok= false;
		if(name.length() != 0 && prenom.length() !=0 ){
			ok = true;
		}
		else {
			ok = false;
		}
   return ok;
}
	
	public String tostring(){
		 String m = "Nom:"+this.name+" prenom:"+this.prenom;
		 return m;
	}
}
