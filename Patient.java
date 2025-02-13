public class Patient extends Person{
    
    public String primaryCarePhysician;
    public String lastVisitedDr;

    public Patient(String firstName, String lastName, String address, String primaryCarePhysician){
        super(firstName, lastName, address);
        this.primaryCarePhysician = primaryCarePhysician;
        this.lastVisitedDr = "None";
    }

    public void visit( String doctorName){
        this.lastVisitedDr= doctorName;
    }

    public String toString(){
        return super.toString() +"\nPrimary Care Physician: " + primaryCarePhysician + "\nLast Visited Doctor: " + lastVisitedDr;
    }
}
