public class Employee extends Person{
    
    public int monthlyWorkHrs;
    public double salary;
    public double hourlyRate;

    public Employee(String firstName, String lastName, String address, int monthlyWorkHrs, double salary, double hourlyRate){
        super(firstName, lastName, address);
        this.monthlyWorkHrs = monthlyWorkHrs;
        this.salary = salary;
        this.hourlyRate = hourlyRate;
    }

    public double calculatePayCheck(){

        if(monthlyWorkHrs > 165){
            int extraHrs =monthlyWorkHrs - 165;
    
            salary = salary + ((salary/165) * 1.5) * extraHrs;
            return salary;
        }

        else{
            return salary;
        }

    }

}
