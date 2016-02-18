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
		String[] sort = new String[countEmployee];
		int[] index = new int[countEmployee];
		
		for(int i = 0; i < countEmployee; i++){
			if(i < (countEmployee-countManager)){
				temp = enterEmployee(i);
				words = temp.split(" ");
				inn = Long.parseLong(words[0]);
				name = words[1];
				sername = words[2];
				salary = Double.parseDouble(words[3]);
				fabrika[i] = new Employee(inn, name, sername, salary);
			}
			else {
				temp = enterFabrikaManager(i);
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
			System.out.println("Enter the type of report : \n a - list of all Employees, \n b - print salary of all stuff, \n c - find employee with min salary, \n d - find employee with max salary, \n for exit - print exit");
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
			else if (temp.charAt(0) == 'a'){
				printA(fabrika, countEmployee);
				
			}
			else {
				System.out.println("Enter correct type of report");
			}
			i--;
			}
	
	}
		
		static void printA(Employee fabrika[], int countEmployee){
			System.out.println("   INN         Name     Sername     Salary   " );
			for(int i = 0; i < countEmployee; i++){
				System.out.println(fabrika[i].getInn() + "     " + fabrika[i].getName() + "     " + fabrika[i].getserName() + "        " + fabrika[i].getSalary());
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
		static String enterEmployee(int i){
			Scanner in = new Scanner(System.in);
			String str;
				System.out.println("Enter INN, Name, Sername and Salary of employee number " + (i + 1) + " : ");
				str = in.nextLine();
			return str;
		}
		static String enterFabrikaManager(int i){
			Scanner in = new Scanner(System.in);
			String str;
				System.out.println("Enter INN, Name, Sername, Salary and Bonus of manager number " + (i + 1) + " : ");
				str = in.nextLine();
			return str;
		}
	

}
