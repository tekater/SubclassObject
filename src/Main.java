import example.Client;
import example.Employee;
import example.Person;
import referencing.Reference;

public class Main {

    // Мы используем каст (изменение) типа класса
    public static void printNames (Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
    public static void main(String[] args) {
        Reference ai = new Reference();
        Reference a = new Reference();

        // ссылка на класс Person и объект Person // Ссылка на класс Client и объект Client
        // Мы ссылаемся на сами подклассы
        Person person = new Person();

        Client client = new Client();
         Employee employee = new Employee();

         // 2 Вариант

        // Вызываем подкласс родительского класса Person // используем ссылку на суперкласс Person
        Person client2 = new Client();
        Person employee2 = new Employee();

        // Получаем доступ к полям класса через ссылку на суперкласс
        employee2.setName("Hadzhime Kazama");
        employee2.setYearOfBirth(1960);

        //employee2.setSalary(30000); // родительский класс не знает о методе setSalary()
        // но у него есть методы setName() setYearOfBirth()

        // Назначение типа класса
        // 1. Обработка массива объектов у которых разные типы из одной иерархии
        // Типо Person, тип Employee, типо Client.
        // 2. Метод который есть у объекта в базовом (родительском) классе, но также может
        // работать с объектами подкласса например : .setName();

        Person person2 = new Client();

        //Employee employee3 = (Employee) new Person();
        //Employee employee3 = (Employee) person2; // Выходит ошибка ClassCastException
        //Client clientAgain = (Client) person;    // Здесь не должно быть ошибок

        Person person3 = new Employee();
        person3.setName("Kazuya Kazama");
        Client client3 = new Client();
        client3.setName("Paul Phoenix");
        Employee employee4 = new Employee();
        employee4.setName("Jhin Kazama");

        Person[] persons = {person3, client3, employee4, employee2};
        printNames(persons);

    }
}