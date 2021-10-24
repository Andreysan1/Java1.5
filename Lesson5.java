/**
 * Java 1. Homework 5
 *
 * @author Andrey Usmanov
 * @version 22.10.2021
 */
class Lesson5 {

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Andrey", "Cook", "@Andrey123.ru", "+9354664456", 100000, 32),
            new Employee("Dmitry", "Manager", "@Dmitry123.ru", "+9379992", 57000, 40),
            new Employee("Kirill", "Driver", "@Kirill123.ru", "+9965465", 40000, 41),
            new Employee("Petr Petrovich", "Director", "@Petr123.ru", "+9345242", 80000, 50),
            new Employee("Anton", "Master", "@Anton123.ru", "+937369877", 30000, 28)
        };
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}

class Employee {
    private String name; 
    private String position;
    private String email;
    private String telephone;
    private int pay;
    private int age;

    Employee(String name, String position, String email, String telephone, int pay, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.pay = pay;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name + ", " + position + ", " + email + ", " + telephone + ", " + pay + ", " + age);
    }
}