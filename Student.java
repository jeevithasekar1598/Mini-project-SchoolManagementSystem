package schoolmanagementsystem;

public class Student {
	private int id;
	private String sname;
	private String saddress;
	private int feespaid;
	private int feestotal;
	public Student()
	{
		
	}
	public Student(int id, String sname, String saddress, int feespaid, int feestotal) {
		super();
		this.id = id;
		this.sname = sname;
		this.saddress = saddress;
		this.feespaid = feespaid;
		this.feestotal = feestotal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public int getFeespaid() {
		return feespaid;
	}
	public void setFeespaid(int feespaid) {
		this.feespaid = feespaid;
	}
	public int getFeestotal() {
		return feestotal;
	}
	public void setFeestotal(int feestotal) {
		this.feestotal = feestotal;
	}
	public double getremaingfees()
	{
		return feestotal-feespaid;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", saddress=" + saddress + ", feespaid=" + feespaid
				+ ", feestotal=" + feestotal + ", Remaingfees="+ getremaingfees()+ "]";
	}	
}
