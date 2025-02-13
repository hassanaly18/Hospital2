public class Employee extends Person{
    
    public int monthlyWorkHrs;
    public double salary;

    public Employee(String firstName, String lastName, String address, int monthlyWorkHrs, double salary){
        super(firstName, lastName, address);
        this.monthlyWorkHrs = monthlyWorkHrs;
        this.salary = salary;
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

    public String toString(){
        return super.toString() + ",Basic Salary: $" + salary + ", Hours Worked: " + monthlyWorkHrs;
    }

}
