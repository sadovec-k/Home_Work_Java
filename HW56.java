import java.util.Scanner;
import java.util.*;
public class HW56 {
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
		Employee[] fabrika = new Employee[countEmployee];
		FabrikaManager[] fabrikaManager = new FabrikaManager[countManager];
		int managerArrayIndex = 0;
			
		for(int i = 0; i < countEmployee; i++){
			if(i < (countEmployee-countManager)){
				temp = enterEmployee(i, in);
				words = temp.split(" ");
				inn = Long.parseLong(words[0]);
				name = words[1];
				sername = words[2];
				salary = Double.parseDouble(words[3]);
				fabrika[i] = new Employee(inn, name, sername, salary);
			}
			else {
				temp = enterFabrikaManager(i, in);
				words = temp.split(" ");
				inn = Long.parseLong(words[0]);
				name = words[1];
				sername = words[2];
				salary = Double.parseDouble(words[3]);
				bonus = Double.parseDouble(words[4]);
				fabrikaManager[managerArrayIndex] = new FabrikaManager(inn, name, sername, salary);
				fabrikaManager[managerArrayIndex].setBonus(bonus);
				fabrika[i] = fabrikaManager[managerArrayIndex];
				managerArrayIndex++;
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
				System.out.println("Sallary of all staff =  " + printB(fabrika, countEmployee));
				System.out.println();
			}
			else if(temp.charAt(0) == 'c'){
				System.out.println("Min Salary : " + fabrika[printMinSalary(fabrika, countEmployee)]);
				System.out.println();
			}
			else if (temp.charAt(0) == 'd'){
				System.out.println("Max Salary : " + fabrika[printMaxSalary(fabrika, countEmployee)]);
				System.out.println();	
			}
			else if (temp.charAt(0) == 'n'){
				Arrays.sort(fabrika);
				print(fabrika, countEmployee);
			}
			else if (temp.charAt(0) == 'i'){
				Arrays.sort(fabrika,InnComparator);
				print(fabrika, countEmployee);
			}
			else if (temp.charAt(0) == 'e'){
				Arrays.sort(fabrika,SernameComparator);
				print(fabrika, countEmployee);
			}
			else if (temp.charAt(0) == 's'){
				Arrays.sort(fabrika,SalaryComparator);
				print(fabrika, countEmployee);
			}
			else {
				System.out.println("Enter correct type of report");
			}
			i--;
			}
	}
		
		static void print(Employee fabrika[], int countEmployee){
			System.out.printf("%-15s%-20s%-20s%-12s%n", "INN", "Name", "Sername", "Salary" );
			for(int i = 0; i < countEmployee; i++){
				System.out.printf("%-15d%-20s%-20s%-10.2f%n", fabrika[i].getInn(), fabrika[i].getName(), fabrika[i].getserName(), fabrika[i].getSalary());
			}
			System.out.println();
		}
		
		static double printB(Employee fabrika[], int countEmployee){
			double salaryAll = 0;
			for(int i = 0; i < countEmployee; i++){
				salaryAll += fabrika[i].getSalary();
			}
			return salaryAll;
		}
		
		static int printMinSalary(Employee fabrika[], int countEmployee){
			double minSalary = fabrika[0].getSalary();
			int number = 0;
			for(int i = 1; i < countEmployee; i++){
				if (minSalary > fabrika[i].getSalary()){
					minSalary = fabrika[i].getSalary();
					number = i;
				}
			}
			return number;
		}
		
		static int printMaxSalary(Employee fabrika[], int countEmployee){
			double maxSalary = fabrika[0].getSalary();
			int number = 0;
			for(int i = 1; i < countEmployee; i++){
				if (maxSalary < fabrika[i].getSalary()){
					maxSalary = fabrika[i].getSalary();
					number = i;
				}
			}
			return number;
		}
	// Enter strings in array from console
		static String enterEmployee(int i, Scanner in){
			String str;
				System.out.println("Enter INN, Name, Sername and Salary of employee number " + (i + 1) + " : ");
				str = in.nextLine();
			return str;
		}
		static String enterFabrikaManager(int i, Scanner in){
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
