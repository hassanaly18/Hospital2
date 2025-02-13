public class Doctor extends Person{
    public String speciality;
    public double OfficeVisitFee;
    public int noOfPatients;

    public Doctor(String firstName, String lastName,String address,String speciality, double OfficeVisitFee){
        super(firstName, lastName, address);
        this.speciality = speciality;
        this.OfficeVisitFee = OfficeVisitFee;
        this.noOfPatients = 0;
    }

    public String toString(){
        return super.toString()+ "\nSpeciality: " + speciality + "\nOffice Visit Fee: " + OfficeVisitFee + "\nNumber of Patients: " + noOfPatients;
    }

    public double calculatePayCheck(){
        return OfficeVisitFee * noOfPatients;
    }

    public void visit(){
        noOfPatients = noOfPatients + 1;
    }

}
