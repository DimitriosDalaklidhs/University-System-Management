package universitysystem;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person {
    private String am;
    private int yearOfEntry;
    private HashMap<String, Double> grades;

    public Student(String firstName, String lastName, int age, String address, Department department,
                   String am, int yearOfEntry) {
        super(firstName, lastName, age, address, department);
        this.am = am;
        this.yearOfEntry = yearOfEntry;
        this.grades = new HashMap<>();
    }

    // Getters
    public String getAm() { return am; }
    public int getYearOfEntry() { return yearOfEntry; }
    public HashMap<String, Double> getGrades() { return grades; }

    // Setters
    public void setAm(String am) { this.am = am; }
    public void setYearOfEntry(int yearOfEntry) { this.yearOfEntry = yearOfEntry; }

    // Methods
    public void addGrade(String course, double grade) {
        grades.put(course, grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) return 0;
        double total = 0;
        for (double grade : grades.values()) {
            total += grade;
        }
        return total / grades.size();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Α.Μ.: " + am);
        System.out.println("Έτος εισαγωγής: " + yearOfEntry);
        System.out.println("Βαθμοί:");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(" - " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Μέσος όρος: " + String.format("%.2f", calculateAverage()));
    }
}
