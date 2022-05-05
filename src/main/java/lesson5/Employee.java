package lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;
    private double salary;

    public Employee(String name, String position, String email, String phoneNumber, int age, double salary) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


    public void printInfo() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(getName());
        System.out.println(getPosition());
        System.out.println(getEmail());
        System.out.println(getPhoneNumber());
        System.out.println(getAge());
        System.out.println(getSalary());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
    }


    public static void main(String[] args) {
        Employee person1 = new Employee("John", "java developer", "john@gmail.com", "+79333464646", 35, 100.0);
        Employee person2 = new Employee("Bob", "php developer", "bob@gmail.com", "+79333464647", 40, 133.0);
        Employee person3 = new Employee("Stan", "python developer", "stan@gmail.com", "+79333464648", 23, 90.0);
        Employee person4 = new Employee("Jason", "fullstack developer", "jason@gmail.com", "+79333464649", 37, 300.0);
        Employee person5 = new Employee("Sam", "backend developer", "sam@gmail.com", "+79333464664", 46, 250.0);

        Employee[] arrayEm = {person1, person2, person3, person4, person5};
        for (Employee employee : arrayEm) {
            if (employee.age >= 40)
                employee.printInfo();
        }

    }
}

