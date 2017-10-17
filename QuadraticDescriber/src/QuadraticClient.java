/* Eric Zhu
 * 10/13/17
 * Part 5
 * 1st Period
 * Client for quadratic describer
 */
import java.util.Scanner;
 public class QuadraticClient {
	 //Creates new scanner in order to allow the user to add inputs
		static Scanner userinput= new Scanner(System.in);
		//String used later to ask if user is done 
		static String response = "";
public static void main(String[] args) {
	//do/while loop to check if user is done
		do {
		System.out.println ("Welcome to Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, and c");
		System.out.println(" ");
		//User input "a" value
		System.out.print("a:");
		double a = userinput.nextDouble();
		//User input "b" value
		System.out.print("b:");
		double b = userinput.nextDouble();
		//User input "c" value
		System.out.print("c:");
		double c = userinput.nextDouble();
		System.out.println(); 
		//Calls to quadDescriber in order to retrieve all info needed
		System.out.println(Quadratic.quadDescriber(a, b, c));
		System.out.println("Do you want to keep going? (Type \"quit\" to end)");
		response = userinput.next();
		//Terminates Program
		} while(!response.equals("quit"));
}}



