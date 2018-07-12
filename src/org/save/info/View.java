package Org.save.Info;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;



public class View extends Frame implements ActionListener  {
    /**
	 MIT lience 
	 */
	private static final long serialVersionUID = 1L;
	Panel m,in;
    Label ln,lp,r;
    TextField tn,tp;
    Button b;
    Controle c;
    public View(String s){
    	/* Frame settings begin */
    	setTitle(s);
    	setBackground(Color.LIGHT_GRAY);
    	setSize(400,300);
    	setLayout(new FlowLayout());
    	/* frame settings end */
    	
    	/* INPUT PANEL BEGIN*/
    	 in = new Panel();
    	 ln = new Label("nom:");
    	 in.add(ln);
    	 tn = new TextField(8);
    	 in.add(tn);
    	 lp = new Label("prenom:");
    	 in.add(lp);
    	 tp = new TextField(8);
    	 in.add(tp);
    	 b = new Button("SUBMIT");
    	 b.addActionListener(this);
    	 in.add(b);
    	 add(in);
    	/* INPUT PANEL END */
    	 
    	 /* OUTPUT PANEL */
    	  m = new Panel();
    	  r = new Label("Resultat");
    	  r.setText("nothing");
    	  m.add(r);
    	  add(m);
    	  
    	 /* OUTPUT PANEL */
    	 /* EXIT SYSTEM */
    	 addWindowListener(new WindowAdapter()
         {
             public void windowClosing(WindowEvent we)
             {
                 System.exit(0);
             }
         });
         
    	 /* EXIT SYSTEM */
    	/* INPUT PANEL END*/
    	Update();
    }
    
    public void Update(){
    	setVisible(true);
    }
    
    public void Update(String ok,String not,Preson p){
    	b.addActionListener(new ActionListener() {
    		Preson l = new Preson();
    		public void actionPerformed(ActionEvent e) {
    			Controle c = new Controle(tn.getText(),tp.getText());
    			if (c.setc()){
    				Update();
    	    		r.setText(ok);
    	    		l.Setlist(tn.getText(),tp.getText());
    	    		p.Setlist(j.getNom(),j.getPrenom());
    	    		try {
						p.SaveOnFile();
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
    	    		}
    	    	else {
    	    		Update();
    	    		p.datadisplay();
    	    		r.setText(not);
    	    	}
    		}
    	});
    	
    }
    
	@Override
	public void actionPerformed(ActionEvent arg) {
		
	}
}
