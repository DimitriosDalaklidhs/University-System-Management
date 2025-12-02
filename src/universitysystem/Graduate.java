package universitysystem;

public class Graduate extends Student {
    private String degreeTitle;
    private double degreeGrade;
    private Professor supervisor;
    private String thesisTitle;

    public Graduate(String firstName, String lastName, int age, String address, Department department,
                    String am, int yearOfEntry, String degreeTitle, double degreeGrade,
                    Professor supervisor, String thesisTitle) {
        super(firstName, lastName, age, address, department, am, yearOfEntry);
        this.degreeTitle = degreeTitle;
        this.degreeGrade = degreeGrade;
        this.supervisor = supervisor;
        this.thesisTitle = thesisTitle;
    }

    // Getters
    public String getDegreeTitle() { return degreeTitle; }
    public double getDegreeGrade() { return degreeGrade; }
    public Professor getSupervisor() { return supervisor; }
    public String getThesisTitle() { return thesisTitle; }

    // Setters
    public void setDegreeTitle(String degreeTitle) { this.degreeTitle = degreeTitle; }
    public void setDegreeGrade(double degreeGrade) { this.degreeGrade = degreeGrade; }
    public void setSupervisor(Professor supervisor) { this.supervisor = supervisor; }
    public void setThesisTitle(String thesisTitle) { this.thesisTitle = thesisTitle; }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Τίτλος Πτυχίου: " + degreeTitle);
        System.out.println("Βαθμός Πτυχίου: " + degreeGrade);
        if (supervisor != null) {
            System.out.println("Επιβλέπων Καθηγητής: " + supervisor.getFirstName() + " " + supervisor.getLastName());
        }
        System.out.println("Τίτλος Πτυχιακής: " + thesisTitle);
    }
}
