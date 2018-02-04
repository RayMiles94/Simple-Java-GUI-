package Org.save.Info;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Date;

public class Preson {
 private String Nom;
 private String Prenom;
 private DataOutputStream dos;
 public Preson(){
	 setNom("");
	 setPrenom("");
 }
 
 public String getNom() {
	return Nom;
 }
 
 public void setNom(String nom) {
	Nom = nom;
 }
 
 public String getPrenom() {
	return Prenom;
 }
 
 public void setPrenom(String prenom) {
	Prenom = prenom;
 }
 
 public void SaveOnFile() throws FileNotFoundException{
	@SuppressWarnings("deprecation")
	Date date = new Date(10, 10, 10);
	 String time="---------------"+date.toString()+"--------------\n";
	 String message = "Nom:"+this.Nom+" prenom:"+this.Prenom+"\n";
	 try {
		 FileOutputStream fos =new FileOutputStream("person.txt",true);
		 dos = new DataOutputStream(fos);
		 dos.writeChars(time);
		 dos.writeChars(message);
		 dos.close();
	 }
	 catch(Exception e){}
 }

 public void Setlist(String one,String Two){
	 setNom(one);
	 setPrenom(Two);
 }
 
 public void datadisplay(){
	 System.out.println("Preson Nom:"+Nom+" Prenom:"+this.Prenom);
 }
}
