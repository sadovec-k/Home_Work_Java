import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class HW56 {
	static List<Employee> Emp = new ArrayList<>();
		
	
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String[] words = new String[5];
			long inn = 0;
			String name;
			String sername;
			double salary = 0;
			double bonus = 0;
			String temp;
		
		int countEmployee = 4;
		int countManager = 2;
				
		for(int i = 0; i < countEmployee; i++){
			if(i < (countEmployee-countManager)){
				temp = enterEmployee(i, in);
				words = temp.split(" ");
				inn = Long.parseLong(words[0]);
				name = words[1];
				sername = words[2];
				salary = Double.parseDouble(words[3]);
				Employee fabrikaEmployee = new Employee(inn, name, sername, salary);
				addEmp(fabrikaEmployee);
			}
			else {
				temp = enterFabrikaManager(i, in);
				words = temp.split(" ");
				inn = Long.parseLong(words[0]);
				name = words[1];
				sername = words[2];
				salary = Double.parseDouble(words[3]);
				bonus = Double.parseDouble(words[4]);
				FabrikaManager man = new FabrikaManager(inn, name, sername, salary); 
				man.setBonus(bonus);
				addEmp(man);
			}
		} 
		for (int i = 0; i < 100; i++){
			System.out.println("Enter the type of report : "
					+ "\n b - print salary of all stuff, "
					+ "\n c - find employee with min salary, "
					+ "\n d - find employee with max salary, "
					+ "\n n - list of all Employees(sort by Name + Sername), "
					+ "\n i - list of all Employees(sort by Inn), "
					+ "\n e - list of all Employees(sort by Sername), "
					+ "\n s - list of all Employees(sort by Salary), "
					+ "\n for exit - print exit");
			temp = in.next();
			if (temp.compareTo("exit")==0){
				return;
			}
			else if(temp.charAt(0) == 'b'){
				System.out.println("Sallary of all staff =  " + printAllSalary());
				System.out.println();
			}
			else if(temp.charAt(0) == 'c'){
				System.out.println("Min Salary : " + printMinSalary());
				System.out.println();
			}
			else if (temp.charAt(0) == 'd'){
				System.out.println("Max Salary : " + printMaxSalary());
				System.out.println();	
			}
			else if (temp.charAt(0) == 'n'){
				Collections.sort(Emp);
				print();
			}
			else if (temp.charAt(0) == 'i'){
				Collections.sort(Emp, InnComparator);
				print();
			}
			else if (temp.charAt(0) == 'e'){
				Collections.sort(Emp, SernameComparator);
				print();
			}
			else if (temp.charAt(0) == 's'){
				Collections.sort(Emp, SalaryComparator);
				print();
			}
			else {
				System.out.println("Enter correct type of report");
			}
			i--;
			}
	}
		public static void addEmp(Employee fabrikaEmployee) {
			Emp.add(fabrikaEmployee);
		
	}
		public static void print(){
			System.out.printf("%-15s%-20s%-20s%-12s%n", "INN", "Name", "Sername", "Salary" );
			for(Employee e: Emp){
				System.out.printf("%-15d%-20s%-20s%-10.2f%n", e.getInn(), e.getName(), e.getserName(), e.getSalary());
			}
			System.out.println();
		}
		
		public static double printAllSalary(){
			double salaryAll = 0;
			for (Employee e: Emp){
				salaryAll += e.getSalary();
			}
			return salaryAll;
		}
		
		public static Employee printMinSalary(){
			Employee minsal = null;
			double minSalary = 0;
			
			for (Employee e: Emp){
				if (e.getSalary() > minSalary){
					minSalary = e.getSalary();
				}
			}
			for (Employee e: Emp){
				if (e.getSalary()< minSalary){
					minSalary = e.getSalary();
					minsal = e;
				}
			}
			return minsal;
		}
		
		public static Employee printMaxSalary(){
			Employee maxsal = null;
			double maxSalary = 0;
			for (Employee e: Emp){
				if (e.getSalary()> maxSalary){
					maxSalary = e.getSalary();
					maxsal = e;
				}
			}
			return maxsal;
		}
	// Enter strings in array from console
		public static String enterEmployee(int i, Scanner in){
			String str;
				System.out.println("Enter INN, Name, Sername and Salary of employee number " + (i + 1) + " : ");
				str = in.nextLine();
			return str;
		}
		public static String enterFabrikaManager(int i, Scanner in){
			String str;
				System.out.println("Enter INN, Name, Sername, Salary and Bonus of manager number " + (i + 1) + " : ");
				str = in.nextLine();
			return str;
		}
				
		public static Comparator<Employee> InnComparator = new Comparator<Employee>(){
		public int compare (Employee e1, Employee e2){
			int result =0;
			if (e1.getInn() > e2.getInn()){
				result =1; 
			}
			else if (e1.getInn() < e2.getInn()){
				result = -1;
			}
			else {
			result = 0;
			}
		return result;}
	};	
	
	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>(){
		public int compare (Employee e1, Employee e2){
			return (int) (e1.getSalary()- e2.getSalary());
		}
	};	
	
	public static Comparator<Employee> SernameComparator = new Comparator<Employee>(){
		public int compare (Employee e1, Employee e2){
			
			return e1.getserName().compareTo(e2.getserName());
		}
	};	
	
	
}
