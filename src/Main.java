public class Main {
    public static void main(String[] args) {
        // Створюємо професора
        Professor professor = new Professor("Іван", "Заболотський", "Computer Science", false, 10, 1000);
        System.out.println("Зарплата професора: " + professor.calculateSalary());
        professor.performDuties();
        System.out.println("Професор військовий: " + professor.isDuty());

        // Створюємо адміністратора
        Administrator administrator = new Administrator("Анна", "Барабаш", "HR", true, 160, 20);
        System.out.println("Зарплата адміністратора: " + administrator.calculateSalary());
        administrator.performDuties();
        System.out.println("Адміністратор військовий: " + administrator.isDuty());
    }
}