public class FabrikaManager extends Employee {

	private double bonus = 0;

	public FabrikaManager(long inn, String name, String sername, double salary) {
		
		super (inn, name, sername, salary);
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
		
	public double getSalary() {
		return super.getSalary() + bonus;
	}
	
	@Override
	public String toString() {
		double salaryPlusBonus = super.getSalary() + bonus;
		return "INN: " + super.getInn() + " Name: " + super.getName() + " Sername: " + super.getserName() + " Salary: " + salaryPlusBonus;
	}
}
