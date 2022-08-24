package schoolmanagementsystem;

public class Teacher extends Student 
{
		private int id;
		private String tname;
		private int salary;
		public Teacher()
		{
			
		}
		public Teacher(int id, String tname, int salary) {
			super();
			this.id = id;
			this.tname = tname;
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTname() {
			return tname;
		}
		public void setTname(String tname) {
			this.tname = tname;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		double annualsalary()
		{
			return salary*12;
		}
		@Override
		public String toString() {
			return "Teacher [id=" + id + ", tname=" + tname + ", salary=" + salary + ", Annualsalary="+ annualsalary()+ "]";
		}
}
