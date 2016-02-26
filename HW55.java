import java.util.Scanner;
public class HW55 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] words = new String[4];
			long inn = 0;
			String name;
			String sername;
			double salary = 0;
			String temp;
			int countEmployy = 10;
		Employee[] fabrika = new Employee[countEmployy];
		
		
		for(int i = 0; i < fabrika.length; i++){
			temp = enterEmployee(i, in);
			words = temp.split(" ");
			inn = Long.parseLong(words[0]);
			name = words[1];
			sername = words[2];
			salary = Double.parseDouble(words[3]);
			fabrika[i] = new Employee(inn, name, sername, salary);
		} 
			
		printA(fabrika);
		printB(fabrika);
		printMinSalary(fabrika);
		printMaxSalary(fabrika);
	}
		static void printA(Employee fabrika[]){
			System.out.println("   INN         Name     Sername     Salary   " );
			for(int i = 0; i < fabrika.length; i++){
				System.out.println(fabrika[i].getInn() + "     " + fabrika[i].getName() + "     " + fabrika[i].getserName() + "        " + fabrika[i].getSalary());
			}
			System.out.println();
		}
		
		static void printB(Employee fabrika[]){
			double salaryAll = 0;
			for(int i = 0; i < fabrika.length; i++){
				salaryAll += fabrika[i].getSalary();
			}
			System.out.println("Sallary of all staff =  " + salaryAll );
			System.out.println();
		}
		
		static void printMinSalary(Employee fabrika[]){
			double minSalary = fabrika[0].getSalary();
			int number = 0;
			for(int i = 1; i < fabrika.length; i++){
				if (minSalary > fabrika[i].getSalary()){
					minSalary = fabrika[i].getSalary();
					number = i;
				}
			}
			System.out.println("Min Salary : " + fabrika[number].getInn() + " " + fabrika[number].getName() + " " + fabrika[number].getserName() + " " + fabrika[number].getSalary());
			System.out.println();
		}
		
		static void printMaxSalary(Employee fabrika[]){
			double maxSalary = fabrika[0].getSalary();
			int number = 0;
			for(int i = 1; i < fabrika.length; i++){
				if (maxSalary < fabrika[i].getSalary()){
					maxSalary = fabrika[i].getSalary();
					number = i;
				}
			}
			System.out.println("Max Salary : " + fabrika[number].getInn() + " " + fabrika[number].getName() + " " + fabrika[number].getserName() + " " + fabrika[number].getSalary());
			System.out.println();
		}
	// Enter strings in array from console
		static String enterEmployee(int i, Scanner in){
			
			String str;
				System.out.println("Enter INN, Name, Sername and Salary of employee number " + (i + 1) + " : ");
				str = in.nextLine();
			return str;
		}
}
