class Professor extends Employee implements Workable, Service {
    private int lecturesCount;
    private double salaryPerLecture;

    public Professor(String firstName, String lastName, String department, boolean isMilitary, int lecturesCount, double salaryPerLecture) {
        super(firstName, lastName, department, isMilitary);
        this.lecturesCount = lecturesCount;
        this.salaryPerLecture = salaryPerLecture;
    }

    @Override
    public double calculateSalary() {
        return lecturesCount * salaryPerLecture; // Розрахунок зарплати за кількість лекцій
    }

    @Override
    public void performDuties() {
        System.out.println("Професор навчає студентів.");
    }

    @Override
    public boolean isDuty() {
        return isMilitary(); // Повертає true, якщо працівник військовий
    }
}

