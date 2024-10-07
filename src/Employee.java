abstract class Employee {
    private String firstName;
    private String lastName;
    private String department;
    private boolean isMilitary;

    public Employee(String firstName, String lastName, String department, boolean isMilitary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.isMilitary = isMilitary;
    }

    // Абстрактний метод для розрахунку зарплати
    public abstract double calculateSalary();

    // Метод для перевірки чи працівник військовий
    public boolean isMilitary() {
        return isMilitary;
    }

    // Геттери для полів
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }
}

