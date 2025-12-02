package universitysystem;

public class Department {
    private String name;
    private String address;
    private String phone;
    private int numberOfStudents;
    private int numberOfEmployees;

    public Department(String name, String address, String phone, int numberOfStudents, int numberOfEmployees) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.numberOfStudents = numberOfStudents;
        this.numberOfEmployees = numberOfEmployees;
    }

    // Getters
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public int getNumberOfStudents() { return numberOfStudents; }
    public int getNumberOfEmployees() { return numberOfEmployees; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setNumberOfStudents(int numberOfStudents) { this.numberOfStudents = numberOfStudents; }
    public void setNumberOfEmployees(int numberOfEmployees) { this.numberOfEmployees = numberOfEmployees; }

    // Print method
    public void printInfo() {
        System.out.println("Τμήμα: " + name);
        System.out.println("Διεύθυνση: " + address);
        System.out.println("Τηλέφωνο: " + phone);
        System.out.println("Αριθμός φοιτητών: " + numberOfStudents);
        System.out.println("Αριθμός εργαζομένων: " + numberOfEmployees);
    }
}
