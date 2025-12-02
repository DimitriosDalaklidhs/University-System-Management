package universitysystem;

import java.util.List;

public class Professor extends Employee {
    private String rank;
    private int phdYear;
    private int publicationCount;
    private int numberOfSupervisedGraduates;
    private List<String> coursesTaught;

    public Professor(String firstName, String lastName, int age, String address, Department department,
                     String afm, double salary, String specialty, int yearsOfExperience,
                     String rank, int phdYear, int publicationCount,
                     int numberOfSupervisedGraduates, List<String> coursesTaught) {
        super(firstName, lastName, age, address, department, afm, salary, specialty, yearsOfExperience);
        this.rank = rank;
        this.phdYear = phdYear;
        this.publicationCount = publicationCount;
        this.numberOfSupervisedGraduates = numberOfSupervisedGraduates;
        this.coursesTaught = coursesTaught;
    }

    // Getters
    public String getRank() { return rank; }
    public int getPhdYear() { return phdYear; }
    public int getPublicationCount() { return publicationCount; }
    public int getNumberOfSupervisedGraduates() { return numberOfSupervisedGraduates; }
    public List<String> getCoursesTaught() { return coursesTaught; }

    // Setters
    public void setRank(String rank) { this.rank = rank; }
    public void setPhdYear(int phdYear) { this.phdYear = phdYear; }
    public void setPublicationCount(int publicationCount) { this.publicationCount = publicationCount; }
    public void setNumberOfSupervisedGraduates(int count) { this.numberOfSupervisedGraduates = count; }
    public void setCoursesTaught(List<String> coursesTaught) { this.coursesTaught = coursesTaught; }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Βαθμίδα: " + rank);
        System.out.println("Έτος Λήψης Διδακτορικού: " + phdYear);
        System.out.println("Αριθμός Δημοσιεύσεων: " + publicationCount);
        System.out.println("Επιβλέπει " + numberOfSupervisedGraduates + " μεταπτυχιακούς");
        System.out.println("Μαθήματα που διδάσκει:");
        for (String course : coursesTaught) {
            System.out.println(" - " + course);
        }
    }
}
