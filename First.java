import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
//java api documentation
class First extends Frame implements ActionListener, WindowListener{
	
	public DoctorSignup sign;
	public StaffSignup signs;
	public PatientSignup signp;
	public showDoc doc;
	public showPatient pat;
	public showStaff st;
	public searchPat da;
	public searchDoctor xa;
	public searchStaff xb;
	public hospitalBal xc;
	
	public Start fi;

	public First(Start f){
		super("Admin Page");
		fi=f;
		sign=new DoctorSignup(this);
		signs=new StaffSignup(this);
		signp=new PatientSignup(this);
		doc=new showDoc(this);
		pat=new showPatient(this);
		st=new showStaff(this);
		da=new searchPat(this);
		xa=new searchDoctor(this);
		xb=new searchStaff(this);
		xc=new hospitalBal(this);
		
		Button l=new Button("DoctorSignup");
		Button s=new Button("StaffSignup");
		Button c=new Button("PatientSignup");
		Button p=new Button("all Doctor");
		Button q=new Button("all Patient");
		Button r=new Button("all Staff");
		Button t=new Button("Search Patient");
		Button u=new Button("Search Doctor");
		Button v=new Button("Search Staff");
		Button x=new Button("Hospital Balance");

		Button w=new Button("Back");
		
		add(l);add(s);add(c);add(p);add(q);add(r);add(t);add(u);add(v);add(x);add(w);
		v.setBounds(880,119,150,30);
		
		l.setBounds(30,40,90,30);
		s.setBounds(140,40,90,30);
		c.setBounds(250,40,90,30);
		p.setBounds(30,120,90,30);
		q.setBounds(140,120,90,30);
		r.setBounds(250,120,90,30);
		t.setBounds(30,160,90,30);
		u.setBounds(140,160,90,30);
		v.setBounds(250,160,90,30);
		x.setBounds(140,210,110,30);
		w.setBounds(140,260,110,30);
	
		l.addActionListener(this);
		s.addActionListener(this);
		c.addActionListener(this);
		p.addActionListener(this);
		q.addActionListener(this);
		r.addActionListener(this);
		t.addActionListener(this);
		u.addActionListener(this);
		v.addActionListener(this);
		x.addActionListener(this);
		w.addActionListener(this);
		
		
		addWindowListener(this);
		setLayout(null);
		setSize(500,400);
		setLocation(500,200);
		
	}
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		
	 if(s.equals("DoctorSignup")){
			sign.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
		else if(s.equals("StaffSignup")){
			signs.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
		    else if(s.equals("PatientSignup")){
			signp.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
		  else if(s.equals("all Doctor")){
			doc.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
				  else if(s.equals("all Patient")){
			pat.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
				  else if(s.equals("all Staff")){
			st.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
			else if(s.equals("Search Patient")){
			da.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
		     else if(s.equals("Search Doctor")){
			xa.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
		     else if(s.equals("Search Staff")){
			xb.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
		 else if(s.equals("Hospital Balance")){
			xc.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
		 else if(s.equals("Back")){
			fi.setVisible(true);
			this.setVisible(false);
			//sign.setParent(this);
		}
		

	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){
		//this.setVisible(false);
		System.exit(0);
		//System.out.println("Window closing");
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}