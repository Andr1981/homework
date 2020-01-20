package main.ru.homework5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(){
        name = "Ivanov Ivan";
        position = "Director";
        email = "ivanov@mail.ru";
        phone = "89992223344";
        salary = 30000;
        age = 35;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();

        System.out.println("ФИО сотрудника: "+employee1.name+"\nДолжность: "+employee1.position+"\nemail: "+
                            employee1.email+"\nТелефон: "+employee1.phone+"\nОклад: "+employee1.salary+
                            "\nВозраст: "+employee1.age);

    }
}


