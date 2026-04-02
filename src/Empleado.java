import java.util.Scanner;

public class Empleado {
	public int code;
	public String name;
	public String area;
	public double salary;
	public double hours;
	public String afiliation;
	public double result;
	
	public static final double AFP_PERCENTAGE = 0.11;
	public static final double ONP_PERCENTAGE = 0.06;
	public static final double HEALTHY = 0.03;
	
	
	private Scanner teclado = new Scanner(System.in);	
	
	public Empleado () {
		System.out.println("Welcome. Please enter the next info:");
	}
	
	public void Code () {
		System.out.print("Please enter you code: ");
		this.code = teclado.nextInt();
		teclado.nextLine();
	}
	
	public void Name () {
		System.out.print("Please enter you name: ");
		this.name = teclado.nextLine();
		//teclado.nextLine();
	}
	
	public void Salary () {
		System.out.print("Please enter you salary: ");
		this.salary = teclado.nextInt();
	}
	
	public void Hours () {
		System.out.print("Please enter you extra hours of work: ");
		this.hours = teclado.nextInt();
		teclado.nextLine();
	}
	
	public void Afiliation () {
		System.out.print("Please type AFP or ONP for your afiliation:");
		this.afiliation = teclado.nextLine();
	}
	
	public void Result() {
	    System.out.print("Welcome " + this.name + " with code " + this.code);
	    System.out.print(" Your net salary is " + this.salary);
	    System.out.print(" But now that you have selected the " + this.afiliation + " afiliation ");
	    System.out.print("and you have " + this.hours + " extra hours of work, ");
	    if (this.afiliation.equalsIgnoreCase("AFP")) {
	        this.result = this.salary - (this.salary * AFP_PERCENTAGE) + (this.salary * HEALTHY);
	    } else if (this.afiliation.equalsIgnoreCase("ONP")) {
	        this.result = this.salary - (this.salary * ONP_PERCENTAGE) + (this.salary * HEALTHY);
	    } else {
	        System.out.print("Error");
	    }

	    double extra = (this.salary * this.hours) / 240.0; 
	    double brute = this.result + extra;               
	    System.out.println("Your brute salary is " + brute); //Nuevo Cambio para el commit
	}

		
}