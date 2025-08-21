package module5._2parameters;

/*
 * Exercise: Create a calculatePay method and use it to replace
 * the redundant code within the main method.
 */
public class E02PayrollCalculator {

	//add a new static method calculatePay here



	public static void main(String[] args) {
		
		double hourlyRate, hoursWorked, weeklyPay;
	      String employee;

	      //Calculate weekly pay for Fred
	      employee = "Fred";
	      hourlyRate = 12.50;
	      hoursWorked = 20;
	      weeklyPay = hourlyRate * hoursWorked;
	      System.out.println(employee  + ":" + weeklyPay);
	      
	      //Calculate weekly pay for Amir 
	      employee = "Amir";
	      hourlyRate = 15.0;
	      hoursWorked = 35;
	      weeklyPay = hourlyRate * hoursWorked;
	      System.out.println(employee  + ":" + weeklyPay);
	}
}

