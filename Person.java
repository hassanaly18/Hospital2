public class Person{

    public String firstName;
    public String lastName;
    public String address;

    //Constructor
    public Person(String firstName, String lastName, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String toString(){
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAddress: " + address;
    }
}