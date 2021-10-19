import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.*;
//java api documentation
class hospitalBal extends Frame implements ActionListener,WindowListener{
	
	
	   public  First first;
       public TextField tf1;
	  private TextArea ta;
	public hospitalBal(First f){
		super("Java First Window");
		first=f;
		Label l1=new Label("Date");
		Label l2=new Label("Total");
		Label l3=new Label("Total balance of the day");
		
		tf1=new TextField(28);
		ta=new TextArea(3,30);
		
		Button b1=new Button("calculate");
		Button b2=new Button("Back");
		
		
		add(l1);add(tf1);add(l2);add(ta);add(l3);add(b1);add(b2);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		addWindowListener(this);
		setLayout(new FlowLayout());
		setSize(280,400);
		setLocation(500,200);
	}
	public void actionPerformed(ActionEvent ae){
		String s=ae.getActionCommand();
		System.out.println(tf1.getText());
		ta.setText("");
		if(s.equals("calculate")){
			try{
				String p=tf1.getText();
				DataAccess da=new DataAccess();
				ResultSet rs=null;
				rs=da.getData("select sum(payment) from patients where date='"+p+"'");
				while(rs.next()){
					String str=rs.getString("sum(payment)");

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

