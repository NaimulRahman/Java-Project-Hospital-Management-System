import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
//java api documentation
class Start extends Frame implements ActionListener,WindowListener{
	
	
	public  First first;
       public TextField tf1;
	   public TextField tf2;
	public Start(){
		super("Admin Login");
		first=new First(this);
		Label l1=new Label("User Name");
		Label l2=new Label("Password");
		
		tf1=new TextField(28);
		tf2=new TextField(28);
		
		Button b1=new Button("Login");
		
		
		add(l1);add(tf1);add(l2);add(tf2);add(b1);
	
		b1.addActionListener(this);
		
		addWindowListener(this);
		setLayout(new FlowLayout());
		setSize(280,400);
		setLocation(500,200);
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("Button Pressed");
		
		String s=e.getActionCommand();
				if(s.equals("Login")){
			    
			DataAccess da=new DataAccess();
			if(tf1.getText().length()==0 || tf2.getText().length()==0)
			{
				JOptionPane.showMessageDialog(this,"You muut type");
			}
			else{
				
			String typedName=tf1.getText();
			String typedPass=tf2.getText();
			String q="select userId,password from login";
			ResultSet rs=null;
			try{
				rs=da.getData(q);
				System.out.println(q);
				int c=0;
				while(rs.next()){
					String n = rs.getString("userId");
					String p= rs.getString("password");
					if(n.equals(typedName) && p.equals(typedPass)){
						System.out.println("Correct Cred.");
						JOptionPane.showMessageDialog(this,"Correct Cred.");
						c++;
						first.setVisible(true);
						this.setVisible(false);
						break;
					}
					
				}
				if(c==0){
						JOptionPane.showMessageDialog(this,"INCorrect Cred.");
						
					}
			}
			catch(Exception ex){
				JOptionPane.showMessageDialog(this,"DB Error");
		
			}
			}
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
