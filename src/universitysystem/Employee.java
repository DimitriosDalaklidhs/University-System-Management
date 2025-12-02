package universitysystem;

public class Employee extends Person {
    private String afm;
    private double salary;
    private String specialty;
    private int yearsOfExperience;

    public Employee(String firstName, String lastName, int age, String address, Department department,
                    String afm, double salary, String specialty, int yearsOfExperience) {
        super(firstName, lastName, age, address, department);
        this.afm = afm;
        this.salary = salary;
        this.specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Getters
    public String getAfm() { return afm; }
    public double getSalary() { return salary; }
    public String getSpecialty() { return specialty; }
    public int getYearsOfExperience() { return yearsOfExperience; }

    // Setters
    public void setAfm(String afm) { this.afm = afm; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }
    public void setYearsOfExperience(int yearsOfExperience) { this.yearsOfExperience = yearsOfExperience; }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("ΑΦΜ: " + afm);
        System.out.println("Μισθός: " + salary + " €");
        System.out.println("Ειδικότητα: " + specialty);
        System.out.println("Χρόνια προϋπηρεσίας: " + yearsOfExperience);
    }
}
