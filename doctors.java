
import java.lang.*;

public class doctors
{
	private String dId;
	private String dName;
	private String dMobileNo;
	private int dSalary;
	private String specialization;
	
	public doctors(){}
	public doctors (String dId, String dName, String dMobileNo, int dSalary, String specialization)
	{
		this.dId = dId;
		this.dName = dName;
		this.dMobileNo = dMobileNo;
		this.dSalary = dSalary;
		this.specialization = specialization;
	}

	public void setDId(String dId)
	{
		this.dId = dId;
	}
	public void setDName(String dName)
	{
	   this.dName = dName;
	}
	public void setDMobileNo(String dMobileNo)
	{
		this.dMobileNo = dMobileNo;
	}
	public void setDSalary(int dSalary)
	{
		this.dSalary = dSalary;
	}
	public void setSpecialization(String specialization)
	{
		this.specialization = specialization;
	}
	
	public String getDId(){return dId;}
	public String getDName() {return dName;}
	public String getDMobileNo(){return dMobileNo;}
	public int getDSalary(){return dSalary;}
	public String getSpecialization(){return specialization;}

}




