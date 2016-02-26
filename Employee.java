public class Employee {
	private long inn;
	private String name;
	private String sername;
	private double salary;
		
	public Employee(long inn, String name, String sername, double salary) {
		this.inn = inn;
		this.name = name;
		this.sername = sername;
		this.salary = salary;
		//System.out.println(inn + " " + name + " " + sername + " " + salary + " 1");
	}
	
	public long getInn() {
		return inn;
	}
	public void setInn(long inn) {
		this.inn = inn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getserName() {
		return sername;
	}
	public void setserName(String sername) {
		this.sername = sername;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
