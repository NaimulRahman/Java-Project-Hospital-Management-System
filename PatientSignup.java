import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class PatientSignup extends Frame implements ActionListener,WindowListener{
	public First first;
	//public Frame parent;
	public TextField tf1;
	public TextField tf2;
	public TextField tf3;
	public TextField tf4;
	public TextField tf5;
	public TextField tf6;
	public TextField tf7;

	
	public PatientSignup(First n){
		super("Patient Signup");
		first=n;
		Label l1=new Label("Patient Id");
		Label l2=new Label("Patient Name");
		Label l3=new Label("Patient Age");
		Label l4=new Label("Patient Gender");
		Label l5=new Label("Appointment");
		Label l6=new Label("Payment");
		Label l7=new Label("Date");
		
		tf1=new TextField(28);
		tf2=new TextField(28);
		tf3=new TextField(28);
		tf4=new TextField(28);
		tf5=new TextField(28);
		tf6=new TextField(28);
		tf7=new TextField(28);

		Button b2=new Button("Signup");
		Button b3=new Button("Back");


		add(l1);add(tf1);add(l2);add(tf2);add(l3);add(tf3);
		add(l4);add(tf4);add(l5);add(tf5);add(l6);add(tf6);add(l7);add(tf7);add(b2);add(b3);
		l1.setBounds(30,40,90,50);
		l2.setBounds(30,80,90,50);
		l3.setBounds(30,120,90,50);
		l4.setBounds(30,160,90,50);
		l5.setBounds(30,200,90,50);
		l6.setBounds(30,240,90,50);
		l7.setBounds(30,280,90,50);
		
		tf1.setBounds(130,50,100,30);
		tf2.setBounds(130,90,100,30);
		tf3.setBounds(130,130,100,30);
		tf4.setBounds(130,170,100,30);
		tf5.setBounds(130,210,100,30);
		tf6.setBounds(130,250,100,30);
		tf7.setBounds(130,290,100,30);
		
        b2.setBounds(40,360,80,30);
		b3.setBounds(140,360,100,30);
		


	
		b2.addActionListener(this);
		b3.addActionListener(this);
		addWindowListener(this);
		
		setLayout(null);
		setSize(800,500);
		setLocation(300,120);
	}
		public void actionPerformed(ActionEvent ae){
		System.out.println("Button Pressed");
		String s=ae.getActionCommand();
		System.out.println(s);
		if(s.equals("Signup")){
			if(tf7.getText().length()==0 || tf1.getText().length()==0|| tf2.getText().length()==0|| tf3.getText().length()==0|| tf4.getText().length()==0|| tf5.getText().length()==0|| tf6.getText().length()==0)
			{
				JOptionPane.showMessageDialog(this,"You Must Type");
			}
			else{
				String q="insert into patients values('"+tf7.getText()+"','"+tf1.getText()+"' ,'"+tf2.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"','"+tf5.getText()+"','"+tf6.getText()+"')";
				System.out.println(q);
				DataAccess da=new DataAccess();
				da.updateDB(q);
			}
		}
	else if(s.equals("Back")){
			first.setVisible(true);
			this.setVisible(false);
		}
	}
	//public void setParent(Frame f){parent=f;}
	
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

