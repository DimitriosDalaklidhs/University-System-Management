package universitysystem;

import java.util.*;

public class University {
    private List<Department> departments;
    private List<Student> students;
    private List<Professor> professors;
    private Scanner scanner;

    public University() {
        departments = new ArrayList<>();
        students = new ArrayList<>();
        professors = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void startMenu() {
        int choice;
        do {
            System.out.println("\n=== Μενού Πανεπιστημίου ===");
            System.out.println("1. Προσθήκη Τμήματος");
            System.out.println("2. Προσθήκη Καθηγητή");
            System.out.println("3. Προσθήκη Φοιτητή");
            System.out.println("4. Προβολή στοιχείων ανά τμήμα");
            System.out.println("5. Υπολογισμός Μ.Ο. βαθμών ανά έτος εισαγωγής");
            System.out.println("6. Υπολογισμός Μ.Ο. δημοσιεύσεων ανά τμήμα");
            System.out.println("7. Αναζήτηση φοιτητή με Α.Μ.");
            System.out.println("8. Αναζήτηση ατόμου με επώνυμο");
            System.out.println("0. Έξοδος");
            System.out.print("Επιλογή: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addDepartment(); break;
                case 2: addProfessor(); break;
                case 3: addStudent(); break;
                case 4: displayByDepartment(); break;
                case 5: calculateAveragePerYear(); break;
                case 6: calculateProfessorAveragePerDepartment(); break;
                case 7: searchStudentByAM(); break;
                case 8: searchByLastName(); break;
                case 0: System.out.println("Έξοδος..."); break;
                default: System.out.println("Μη έγκυρη επιλογή.");
            }

        } while (choice != 0);
    }

    public void addDepartment() {
        System.out.println("Εισαγωγή νέου τμήματος:");
        System.out.print("Όνομα τμήματος: ");
        String name = scanner.nextLine();
        System.out.print("Διεύθυνση: ");
        String address = scanner.nextLine();
        System.out.print("Τηλέφωνο γραμματείας: ");
        String phone = scanner.nextLine();
        System.out.print("Αριθμός φοιτητών: ");
        int numStudents = scanner.nextInt();
        System.out.print("Αριθμός εργαζομένων: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine();

        Department department = new Department(name, address, phone, numStudents, numEmployees);
        departments.add(department);
        System.out.println("Το τμήμα προστέθηκε επιτυχώς.");
    }

    public void addProfessor() {
        System.out.println("Εισαγωγή νέου καθηγητή:");
        System.out.print("Όνομα: ");
        String firstName = scanner.nextLine();
        System.out.print("Επώνυμο: ");
        String lastName = scanner.nextLine();
        System.out.print("Ηλικία: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Διεύθυνση: ");
        String address = scanner.nextLine();

        Department dept = chooseDepartment();

        System.out.print("ΑΦΜ: ");
        String afm = scanner.nextLine();
        System.out.print("Μισθός: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ειδικότητα: ");
        String specialty = scanner.nextLine();
        System.out.print("Χρόνια προϋπηρεσίας: ");
        int experience = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Βαθμίδα: ");
        String rank = scanner.nextLine();
        System.out.print("Έτος λήψης διδακτορικού: ");
        int phdYear = scanner.nextInt();
        System.out.print("Αριθμός δημοσιεύσεων: ");
        int publications = scanner.nextInt();
        System.out.print("Αριθμός επιβλεπόμενων μεταπτυχιακών: ");
        int graduates = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Πόσα μαθήματα διδάσκει; ");
        int courseCount = scanner.nextInt();
        scanner.nextLine();
        List<String> courses = new ArrayList<>();
        for (int i = 0; i < courseCount; i++) {
            System.out.print("Μάθημα " + (i + 1) + ": ");
            courses.add(scanner.nextLine());
        }

        Professor professor = new Professor(firstName, lastName, age, address, dept,
                afm, salary, specialty, experience, rank, phdYear, publications, graduates, courses);

        professors.add(professor);
        System.out.println("Ο καθηγητής προστέθηκε επιτυχώς.");
    }

    public void addStudent() {
        System.out.println("Εισαγωγή νέου φοιτητή:");
        System.out.print("Όνομα: ");
        String firstName = scanner.nextLine();
        System.out.print("Επώνυμο: ");
        String lastName = scanner.nextLine();
        System.out.print("Ηλικία: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Διεύθυνση: ");
        String address = scanner.nextLine();

        Department dept = chooseDepartment();

        System.out.print("Α.Μ.: ");
        String am = scanner.nextLine();
        System.out.print("Έτος εισαγωγής: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(firstName, lastName, age, address, dept, am, year);

        System.out.print("Πόσα μαθήματα θα εισαχθούν; ");
        int courseCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < courseCount; i++) {
            System.out.print("Μάθημα: ");
            String course = scanner.nextLine();
            System.out.print("Βαθμός: ");
            double grade = scanner.nextDouble();
            scanner.nextLine();
            student.addGrade(course, grade);
        }

        students.add(student);
        System.out.println("Ο φοιτητής προστέθηκε επιτυχώς.");
    }

    private Department chooseDepartment() {
        System.out.println("Επιλογή τμήματος:");
        for (int i = 0; i < departments.size(); i++) {
            System.out.println((i + 1) + ". " + departments.get(i).getName());
        }
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        return departments.get(index);
    }

    public void displayByDepartment() {
        for (Department dept : departments) {
            System.out.println("\n--- Τμήμα: " + dept.getName() + " ---");
            System.out.println("Καθηγητές:");
            for (Professor p : professors) {
                if (p.getDepartment().equals(dept)) {
                    p.printInfo();
                    System.out.println();
                }
            }
            System.out.println("Φοιτητές:");
            for (Student s : students) {
                if (s.getDepartment().equals(dept)) {
                    s.printInfo();
                    System.out.println();
                }
            }
        }
    }

    public void calculateAveragePerYear() {
        Map<Integer, List<Double>> yearToGrades = new HashMap<>();
        for (Student s : students) {
            int year = s.getYearOfEntry();
            yearToGrades.putIfAbsent(year, new ArrayList<>());
            yearToGrades.get(year).add(s.calculateAverage());
        }

        for (int year : yearToGrades.keySet()) {
            List<Double> grades = yearToGrades.get(year);
            double avg = grades.stream().mapToDouble(Double::doubleValue).average().orElse(0);
            System.out.println("Έτος: " + year + " -> Μ.Ο. βαθμών: " + String.format("%.2f", avg));
        }
    }

    public void calculateProfessorAveragePerDepartment() {
        for (Department dept : departments) {
            int sum = 0;
            int count = 0;
            for (Professor p : professors) {
                if (p.getDepartment().equals(dept)) {
                    sum += p.getPublicationCount();
                    count++;
                }
            }
            double avg = count == 0 ? 0 : (double) sum / count;
            System.out.println("Τμήμα: " + dept.getName() + " -> Μ.Ο. δημοσιεύσεων: " + String.format("%.2f", avg));
        }
    }

    public void searchStudentByAM() {
        System.out.print("Εισάγετε Α.Μ. φοιτητή: ");
        String am = scanner.nextLine();
        for (Student s : students) {
            if (s.getAm().equalsIgnoreCase(am)) {
                s.printInfo();
                return;
            }
        }
        System.out.println("Δεν βρέθηκε φοιτητής με αυτόν τον Α.Μ.");
    }

    public void searchByLastName() {
        System.out.print("Εισάγετε επώνυμο: ");
        String lastName = scanner.nextLine();
        boolean found = false;
        for (Student s : students) {
            if (s.getLastName().equalsIgnoreCase(lastName)) {
                s.printInfo();
                found = true;
            }
        }
        for (Professor p : professors) {
            if (p.getLastName().equalsIgnoreCase(lastName)) {
                p.printInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Δεν βρέθηκε άτομο με αυτό το επώνυμο.");
        }
    }
}

