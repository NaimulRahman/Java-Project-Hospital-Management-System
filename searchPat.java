import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
public class searchPat extends Frame implements ActionListener,WindowListener{
	public TextField tf1;
	private TextArea ta;
	//private Frame parent;
	private First first;
	public searchPat(First f){
		super("Show all Patients");
		first=f;
		Label l=new Label("Search Patient");
		tf1=new TextField (28);
		ta=new TextArea(5,30);
		Button b=new Button("Search");
		Button b2=new Button("Exit");
		Button b3=new Button("Back");
		add(l);add(tf1);add(ta);
		add(b);add(b2);add(b3);
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		addWindowListener(this);
		
		setLayout(new FlowLayout());
		setSize(270,400);
		setLocation(800,200);
		//setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String s=ae.getActionCommand();
		System.out.println(ta.getText());
		ta.setText("");
		if(s.equals("Search")){
			try{
				String p=tf1.getText();
				DataAccess da=new DataAccess();
				ResultSet rs=null;
				rs=da.getData("select pid,pname,page,pgender,appointment,payment from patients where pid="+p+"");
				while(rs.next()){
					String str=rs.getString("pid")+" | "+rs.getString("pname")+" | "+rs.getString("page")+" | "+rs.getString("pgender")+" | "+rs.getString("appointment")+" | "+rs.getString("payment");
					
					
					
					ta.append(str+"\n");
				}
			}catch(Exception ex){ex.printStackTrace();}
			//ta.append("my text\n");
		}
		else if(s.equals("Exit")){
			System.exit(0);
		}
			else if(s.equals("Back")){
			first.setVisible(true);
			this.setVisible(false);
		
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