import java.util.Scanner;

public class Driver{
	
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		Person P;
		System.out.println("Type 1 for American, or 2 for European: ");
		if(scnr.nextInt() == 1)
			P = new American();
					
		else
			P = new European();

		System.out.print("Car Driven: ");
		P.carYouDrive();
		System.out.print("Job: ");
		P.job();





	}
}
