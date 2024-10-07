class Administrator extends Employee implements Workable, Service {
    private int hoursWorked;
    private double hourlyRate;

    public Administrator(String firstName, String lastName, String department, boolean isMilitary, int hoursWorked, double hourlyRate) {
        super(firstName, lastName, department, isMilitary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate; // Розрахунок зарплати на основі годин
    }

    @Override
    public void performDuties() {
        System.out.println("Адміністратор керує адміністративними завданнями.");
    }

    @Override
    public boolean isDuty() {
        return isMilitary(); // Повертає true, якщо працівник військовий
    }
}

