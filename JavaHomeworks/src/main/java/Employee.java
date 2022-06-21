import java.util.Scanner;
public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    static Scanner scanner = new Scanner(System.in);

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Имя сотрудника: "+name + ", должность: " + position);
        System.out.println("email сотрудника: "+ email + ", телефон: " + phone);
        System.out.println("Зарплата: "+ salary + ", возраст сотрудника: " + age);
    }
    //создаю сотрудника и вызываю метод с инфой
    public static void main(String[] args) {
        Employee emp1 = new Employee("Anton Ivanov", "developer", "ai@gmail.com", "468243", 100500, 30);
        emp1.info();

        //создаю массив из пяти сотрудников и  цикле вывожу инфу о сотрудниках старше сорока
        Employee[] employeesArray = new Employee[5];
        for (int i = 0; i < employeesArray.length; i++) {
            System.out.println("Введите данные сотрудника №"+  i+1);
            employeesArray[i] = new Employee(scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt());
        }
        System.out.println("Сотрудники старше сорока: ");
        for (int i = 0; i < 5; i++) {
            //возраст - это шестой параметр класса Employee
            if (employeesArray[i].age > 40) {
                employeesArray[i].info();
            }
        }
    }
}
