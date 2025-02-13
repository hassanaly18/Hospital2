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
         
        employees.add(new Employee("Jill","Allen",
         "Pizza Street", 170, 2500.0));  


         //"try" is used when we expect to get an error, but dont want the program to stop or crash because of it
        try (Scanner scanner = new Scanner(System.in)) {
            String choice;
            
            do {
                System.out.print("Enter patient's First name: ");
                String fName = scanner.next();
                System.out.print("Enter patient's Last name: ");
                String lName = scanner.next();
                

                //Checking if a patient is already in the patients array
                Patient p1 = null;
                for (Patient p : patients) {
                    if (p.lastName.equals(lName) && p.firstName.equals(fName)) //Comparing entered patient's first and last name with all the patients already in the patients array
                     {
                        p1 = p;
                        break;
                    }
                }
                
                //If patient is not already present, he will have to enter his address and pcp too, for the first time
                if (p1 == null) {
                    System.out.print("Enter patient address: ");
                    scanner.nextLine();
                    String address = scanner.nextLine();
                    System.out.print("Enter primary care physician: ");
                    String pcp = scanner.nextLine();
                    p1 = new Patient(fName, lName, address, pcp);
                    patients.add(p1);
                }
                
                //Entering doctor's last name 
                System.out.print("Enter doctor last name to visit: ");
                String doctorName = scanner.next();
                
                
                //Checking if the doctor exists, by comparing his last name in the doctors array
                Doctor selectedDoctor = null;
                for (Doctor d : doctors) {
                    if (d.lastName.equals(doctorName)) //Comparing entered doctos's last name with all the doctors already in the doctors array
                     {
                        selectedDoctor = d;
                        break;
                    }
                }
                
                //If that doctor exists
                if (selectedDoctor != null) {
                   
                    p1.visit(doctorName);  //visit function in Doctor class will run, that will add 1 patient in noOfPatients
                   
                   
                    selectedDoctor.visit(); //the doctor will be added to the visit function of the Patient
                   
                    //You may or may not use the 5 lines below, its up to you
                    // System.out.println("*********************************");
                    // System.out.println("RECEIPT");
                    // System.out.println("Patient: " + p1);
                    // System.out.println("Visited Doctor: Dr. " + doctorName);
                    // System.out.println("*********************************");
                } 
                else  //if doctor does not exist
                {                                           
                    System.out.println("Doctor not found.");
                }


                //Asking to add another patient, if no, then the program/loop will stop
                System.out.print("Do you want to add another patient? (yes/no): ");
                choice = scanner.next();
            } 
            while (choice.equalsIgnoreCase("yes")); //loop condition
        }
        
        System.out.println("\n*********************************");
        System.out.println("STAFF PAYCHECK REPORT");


        //loop to show the paychecks of all the doctors
        for (Doctor d : doctors) {
            System.out.println("\n*********************************");
            System.out.println("DOCTOR'S INFO");
            System.out.println(d + "\nPaycheck: $" + d.calculatePayCheck());
            System.out.println("\n*********************************");
        }

        //loop to show the paychecks of all the employees
        for (Employee e : employees) {
            System.out.println("\n*********************************");
            System.out.println("EMPLOYEE'S INFO");
            System.out.println(e + "\nPaycheck: $" + e.calculatePayCheck());
            System.out.println("\n*********************************");
        }
        System.out.println("*********************************");
    }
    
}
