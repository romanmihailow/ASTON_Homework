//Lessons5_1
public final class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String email;
    private String telephone;
    private int age;
    private double salary;

    public Employee(int employeeId, String firstName, String lastName, String jobTitle, String email, String telephone, int age, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
        this.salary = salary;

    }

    //--------Метод для вывода информации об объекте в консоль

    public void printInfoEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee First Name: " + firstName);
        System.out.println("Employee Last Name: " + lastName);
        System.out.println("Employee Job Title: " + jobTitle);
        System.out.println("Employee Email: " + email);
        System.out.println("Employee Telephone: " + telephone);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);


    }

}