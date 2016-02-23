import java.util.Scanner;
public class Aclasses{
	public static void main (String args[]){
	Scanner in = new Scanner(System.in);
		int radius = 0;
		int shortR = 0;
		int longR = 0;
		String str;
		
		for (int i = 0; i < 1; i++){
			System.out.println("Enter the type of shape: cycle, ellipse, triangle or rectangle. For exit - exit");
			str = in.next();
			if (str.compareTo("exit")==0){
				System.out.println("By!");
				i = 1;
			}
			else if (str.compareTo("cycle")==0){
				System.out.println("Enter radius");
				radius = in.nextInt();
				cycle c = new cycle(radius);
				System.out.println("Perimetr = " + c.getPerimetr() + " Square = " + c.getSquare());
			}
			else if (str.compareTo("ellipse")==0){
				System.out.println("Enter short radius");
				shortR = in.nextInt();
				System.out.println("Enter long radius");
				longR = in.nextInt();
				ellipse e = new ellipse(shortR, longR);
				System.out.println("Perimetr = " + e.getPerimetr() + " Square = " + e.getSquare());
			}
			else if (str.compareTo("triangle")==0){
				System.out.println("Enter side A");
				int sideA = in.nextInt();
				System.out.println("Enter side B");
				int sideB = in.nextInt();
				System.out.println("Enter side C");
				int sideC = in.nextInt();
				triangle t = new triangle(sideA, sideB, sideC);
				System.out.println("Perimetr = " + t.getPerimetr() + " Square = " + t.getSquare());
			}
			else if (str.compareTo("rectangle")==0){
				System.out.println("Enter side A");
				int sideA = in.nextInt();
				System.out.println("Enter side B");
				int sideB = in.nextInt();
				rectangle r = new rectangle(sideA, sideB);
				System.out.println("Perimetr = " + r.getPerimetr() + " Square = " + r.getSquare());
			}
		}
	}
}