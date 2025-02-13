import java.util.ArrayList;
import java.util.Scanner;

public class Clinic {

    public static void main(String[] args) {

        //Made 3 arrays to store the objects of the classes
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();


        //added 2 doctors and 2 employees
        doctors.add(new Doctor("John", "Doe",
         "123 Main St", "Cardiologist", 100.0));
        
        doctors.add(new Doctor("Jane", "Smith",
         "456 Elm St", "Dermatologist", 150.0));

        employees.add(new Employee("Jack","Baker",
         "Pizza Street", 160, 2000.0));
        employees.add(new Employee("Jill","Baker",
         "Pizza Street", 170, 2500.0));  

        Scanner input = new Scanner(System.in);
        String choice="yes";

        do{
            System.out.println("Enter patient's first name: ");
            String fName = input.nextLine();
            System.out.println("Enter patient's last name: ");
            String lName = input.nextLine();

            System.out.println("Yes or no: ");
            choice =input.next();

        } while(choice.equalsIgnoreCase("yes"));
    }
}
