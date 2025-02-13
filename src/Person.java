//Lessons5_2
public final class Person {
    private String name;
    private String jobTitle;
    private String email;
    private String telephone;
    private double salary;
    private int age;


    public Person(String name, String jobTitle, String email, String telephone, double salary, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;

    }

    public String getName() {
        return name;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public String getEmail(){
        return email;
    }
    public String getTelephone(){
        return telephone;
    }
    public double getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }





}
