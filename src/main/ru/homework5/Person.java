package main.ru.homework5;

import java.util.Arrays;

public class Person {
    private  String name;
    private  String position;
    private  String email;
    private  String phone;
    private  int salary;
    private  int age;

    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public String toString(){
        return String.format("Имя: %s\nДолжность: %s\nEmail: %s\n Номер телефона: %s\n Зарплата: %d\n Возраст: %d \n",
                name, position, email, phone, salary, age);}
    public void print(){
        System.out.println(this);
    }


        public static void main(String[] args){
            Person[] persArray = new Person[6];
            persArray[0] = new Person("Ivanov Ivan", "manager1", "ivivan@mailbox.com", "892312312", 30000, 30);
            persArray[1] = new Person("Smirnov Igor", "manager2", "smirnov@mailbox.com", "89999999", 40000, 40);
            persArray[2] = new Person("Petrov Pavel", "manager3", "petrov@mailbox.com", "877777777", 42000, 42);
            persArray[3] = new Person("Sidorov Andrey", "manager4", "sidorov@mailbox.com", "866666666", 47000, 47);
            persArray[4] = new Person("Kuznecov Ilya", "manager5", "kuznecov@mailbox.com", "855555555", 25000, 25);
            persArray[5] = new Person("Popov Sergry", "manager6", "popov@mailbox.com", "844444444", 27000, 27);

            for (int i=0; i < persArray.length; i++){
                if(persArray[i].age>40){
                    persArray[i].print();
                }

            }


        }
}


