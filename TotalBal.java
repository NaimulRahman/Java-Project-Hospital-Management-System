import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
public class TotalBal extends Frame implements ActionListener,WindowListener{
	private TextArea ta;
	//private Frame parent;
	private First first;
	public TotalBal(First f){
		super("Balance");
		first=f;
		Label l=new Label("Date");
		ta=new TextArea(5,40);
		Button b=new Button("Calculate");
		Button b2=new Button("Back");
		add(l);add(ta);
		add(b);add(b2);
		b.addActionListener(this);
		b2.addActionListener(this);
		addWindowListener(this);

		setLayout(new FlowLayout());
		setSize(320,400);
		setLocation(800,200);
		//setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String s=ae.getActionCommand();
		System.out.println(ta.getText());
		ta.setText("");
		if(s.equals("Calculate")){
			try{
				DataAccess da=new DataAccess();
				ResultSet rs=null;
				rs=da.getData("select sname,sid,smobileno,ssalary,jobtitle from staffmembers");
				while(rs.next()){
					String str=rs.getString("sname")+" | "+rs.getString("sid")+" | "+rs.getString("smobileno")+" | "+rs.getString("ssalary")+" | "+rs.getString("jobtitle");
					
					
					
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